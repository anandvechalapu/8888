@Entity
@Table(name = "wholesalers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wholesalers {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "number")
  private Long number;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "contact_name")
  private String contactName;
  
  @Column(name = "email_address")
  private String emailAddress;
  
  @Column(name = "active")
  private Boolean acive;
  
  @Column(name = "date_created")
  private Date dateCreated;
  
  @Column(name = "last_modified")
  private Date lastModified;
  
}