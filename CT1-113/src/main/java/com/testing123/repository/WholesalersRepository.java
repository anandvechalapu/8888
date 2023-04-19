·       Ability to add, edit and delete the Wholesalers.·       Ability to download the Wholesalers as .csv file.·       Ability to reset the data.

@Repository
public interface WholesalersRepository extends JpaRepository<Wholesalers, Long> {
  
  List<Wholesalers> findByName(String name);

  List<Wholesalers> findByNumber(Long number);

  List<Wholesalers> findByType(String type);

  List<Wholesalers> findByContactName(String contactName);

  List<Wholesalers> findByEmailAddress(String emailAddress);

  List<Wholesalers> findByActive(Boolean active);

  List<Wholesalers> findByDateCreated(Date dateCreated);

  List<Wholesalers> findByLastModified(Date lastModified);
  
  void saveWholesalers(Wholesalers wholesalers);

  void deleteWholesalers(Wholesalers wholesalers);
  
  List<Wholesalers> downloadWholesalersAsCSV();

}