package com.spring.henallux.cyberware.model.main;

import com.spring.henallux.cyberware.dataAccess.utility.AuthorityConverter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.*;
import java.util.*;

public class Customer implements UserDetails {
    private Integer identifier;
    @NotNull
    @Size(min = 1, max = 30)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 30)
    private String lastName;
    @NotNull
    @Size(min = 1, max = 50)
    private String username;
    @Size(max = 20)
    private String phoneNumber;
    @NotNull
    @Size(min = 1, max = 100)
    private String address;
    @NotNull
    @Size(min = 1, max = 60)
    private String password;
    @Size(max = 30)
    private String authorities;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean credentialsNonExpired;
    private Boolean enabled;

    public Customer() {}

    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return AuthorityConverter.authorityStringToAuthorityCollection(authorities);
    }
    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }
    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }
    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }
    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}