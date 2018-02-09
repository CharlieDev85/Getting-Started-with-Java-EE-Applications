package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-08T20:30:19")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> auxText;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> encryptedPass;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}