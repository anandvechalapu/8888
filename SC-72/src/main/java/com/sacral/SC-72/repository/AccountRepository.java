@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
 
    Optional<Account> findByName(String name);
 
    Optional<Account> findByEmail(String email);
 
    Optional<Account> findByPhoneNumber(String phoneNumber);
 
    Optional<Account> findByAccountNumber(String accountNumber);
 
    void update(Account account);
 
    void delete(Long id);
 
    void logOut();
}