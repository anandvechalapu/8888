@Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.dateCreated = :dateCreated")
    Wholesalers findByNameAndDateCreated(@Param("name") String name, @Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.name = :name AND w.lastModified = :lastModified")
    Wholesalers findByNameAndLastModified(@Param("name") String name, @Param("lastModified") Date lastModified);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.type = :type")
    Wholesalers findByNumberAndType(@Param("number") String number, @Param("type") String type);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.contactName = :contactName")
    Wholesalers findByNumberAndContactName(@Param("number") String number, @Param("contactName") String contactName);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.emailAddress = :emailAddress")
    Wholesalers findByNumberAndEmailAddress(@Param("number") String number, @Param("emailAddress") String emailAddress);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.active = :active")
    Wholesalers findByNumberAndActive(@Param("number") String number, @Param("active") Boolean active);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.dateCreated = :dateCreated")
    Wholesalers findByNumberAndDateCreated(@Param("number") String number, @Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.number = :number AND w.lastModified = :lastModified")
    Wholesalers findByNumberAndLastModified(@Param("number") String number, @Param("lastModified") Date lastModified);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type AND w.contactName = :contactName")
    Wholesalers findByTypeAndContactName(@Param("type") String type, @Param("contactName") String contactName);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type AND w.emailAddress = :emailAddress")
    Wholesalers findByTypeAndEmailAddress(@Param("type") String type, @Param("emailAddress") String emailAddress);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type AND w.active = :active")
    Wholesalers findByTypeAndActive(@Param("type") String type, @Param("active") Boolean active);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type AND w.dateCreated = :dateCreated")
    Wholesalers findByTypeAndDateCreated(@Param("type") String type, @Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.type = :type AND w.lastModified = :lastModified")
    Wholesalers findByTypeAndLastModified(@Param("type") String type, @Param("lastModified") Date lastModified);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.contactName = :contactName AND w.emailAddress = :emailAddress")
    Wholesalers findByContactNameAndEmailAddress(@Param("contactName") String contactName, @Param("emailAddress") String emailAddress);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.contactName = :contactName AND w.active = :active")
    Wholesalers findByContactNameAndActive(@Param("contactName") String contactName, @Param("active") Boolean active);
 
    @Query("SELECT w FROM Wholesalers w WHERE w.contactName = :contactName AND w.dateCreated = :dateCreated")
    Wholesalers findByContactNameAndDateCreated(@Param("contactName") String contactName, @Param("dateCreated") Date dateCreated);
 
    @Query("SELECT w FROM