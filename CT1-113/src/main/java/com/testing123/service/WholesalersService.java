@Service
public class WholesalersService {

  @Autowired
  private WholesalersRepository wholesalersRepository;

  public List<Wholesalers> getAllWholesalers() {
    return wholesalersRepository.findAll();
  }

  public Wholesalers getWholesalersById(Long id) {
    return wholesalersRepository.findById(id).orElse(null);
  }

  public List<Wholesalers> getWholesalersByName(String name) {
    return wholesalersRepository.findByName(name);
  }

  public List<Wholesalers> getWholesalersByNumber(Long number) {
    return wholesalersRepository.findByNumber(number);
  }

  public List<Wholesalers> getWholesalersByType(String type) {
    return wholesalersRepository.findByType(type);
  }

  public List<Wholesalers> getWholesalersByContactName(String contactName) {
    return wholesalersRepository.findByContactName(contactName);
  }

  public List<Wholesalers> getWholesalersByEmailAddress(String emailAddress) {
    return wholesalersRepository.findByEmailAddress(emailAddress);
  }

  public List<Wholesalers> getWholesalersByActive(Boolean active) {
    return wholesalersRepository.findByActive(active);
  }

  public List<Wholesalers> getWholesalersByDateCreated(Date dateCreated) {
    return wholesalersRepository.findByDateCreated(dateCreated);
  }

  public List<Wholesalers> getWholesalersByLastModified(Date lastModified) {
    return wholesalersRepository.findByLastModified(lastModified);
  }
  
  public void saveWholesalers(Wholesalers wholesalers) {
    wholesalersRepository.saveWholesalers(wholesalers);
  }

  public void deleteWholesalers(Wholesalers wholesalers) {
    wholesalersRepository.deleteWholesalers(wholesalers);
  }
  
  public List<Wholesalers> downloadWholesalersAsCSV() {
    return wholesalersRepository.downloadWholesalersAsCSV();
  }
  
  public void resetData() {
    wholesalersRepository.deleteAll();
  }
}