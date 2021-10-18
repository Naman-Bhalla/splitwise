package models;

import java.util.Date;

public abstract class BaseModel {
    Long id;
    Date createdAt;
    Date modifiedAt;
    Boolean status;    
}
