package com.generics.practice.erasure.bounds;
import java.lang.reflect.*;
/*Use a type tag along with reflection to create a method that uses the argument version of 
newInstance() to create an object of a class with a constructor that has arguement*/
class ClassAsFactory1<T> {
	Class<T> kind;

	public ClassAsFactory1(Class<T> kind) {
		this.kind = kind;
	}

	public T create(int arg) {
		try {
			// Technique 1 (verbose)
			for (Constructor<?> ctor : kind.getConstructors()) {
				// Look for a constructor with a single parameter:
				Class<?>[] params = ctor.getParameterTypes();
				if (params.length == 1)
					if (params[0] == int.class)
						return kind.cast(ctor.newInstance(arg));
			}
			// Technique 2 (direct)
			// Constructor<T> ct = kind.getConstructor(int.class);
			// return ct.newInstance(arg);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}

//The main difference here is that technique 1 throws no exception if it can’t find a
//suitable constructor, whereas technique 2 does. Also note that we use the cast( )
//method to perform a dynamic type-cast.
//If you want to get fancier, ask the user (via the console) what values to use.

