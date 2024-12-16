### ACCESS MODIFIERS IN JAVA

Access modifiers in Java determine the scope of access for classes, methods, and variables. There are four types of access modifiers:

1. **`public`**: The member is accessible from any other class.
2. **`protected`**: The member is accessible within its own package and by subclasses.
3. **`default`** (no modifier): The member is accessible only within its own package.
4. **`private`**: The member is accessible only within its own class.

### `public`
- Can be accessed from any other class.
- Most permissive access level.

```java
public class PublicExample {
    public int publicNumber = 10;
}
```

### `protected`
- Accessible within the same package and subclasses.
- Offers a level of protection more than default but less than private.

```java
package example;

public class ProtectedExample {
    protected int protectedNumber = 20;
}
```

### `default`
- No keyword is used.
- Accessible only within classes in the same package.
- More restrictive than protected and public.

```java
package example;

class DefaultExample {
    int defaultNumber = 30;
}
```

### `private`
- Accessible only within the class it is declared.
- Most restrictive access level.

```java
public class PrivateExample {
    private int privateNumber = 40;
    
    public int getPrivateNumber() {
        return privateNumber;
    }
}
```

### Choosing the Right Modifier
- Use `private` for components that are used internally by the class.
- Use `public` for methods and variables that are meant to be accessed from other classes.
- Use `protected` for methods and variables that should be accessible to subclasses, including those in different packages.
- Use default access for methods and variables that should be accessible only within classes in the same package.