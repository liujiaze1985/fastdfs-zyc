package cn.me.fdfs.vo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Created with IntelliJ IDEA. User: wanglt Date: 12-8-27 Time: 下午9:22 To change this template use
 * File | Settings | File Templates.
 */
@Entity
@Table(name = "tbwarninguser")
public class WarningUser implements Serializable {
  private String id;
  private String name;
  private String email;
  private String phone;

  @Id
  @GeneratedValue(generator = "system_uuid")
  @GenericGenerator(name = "system_uuid", strategy = "uuid")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
