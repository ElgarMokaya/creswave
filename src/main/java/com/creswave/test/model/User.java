package com.creswave.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {

    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String name;

	private String email;

	private String password;

	private String about;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Post> listOfPosts = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Comment> listOfComments = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user", referencedColumnName = "userId"), inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "roleId"))
	private Set<Role> roles = new HashSet<>();




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> collect = this.roles.stream()
				.map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());

		System.out.println(collect);

		return collect;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
