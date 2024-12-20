package Stream.project.stream.models.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;
import org.apache.tomcat.jni.Address;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userName;
    private List<AddressDto> addresses;
    private String role;

}
