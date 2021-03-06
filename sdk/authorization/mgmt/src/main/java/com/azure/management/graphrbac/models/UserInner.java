// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.graphrbac.SignInName;
import com.azure.management.graphrbac.UserType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The User model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("User")
@Fluent
public final class UserInner extends DirectoryObjectInner {
    /*
     * This must be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property when creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account with their Azure AD user object.
     */
    @JsonProperty(value = "immutableId")
    private String immutableId;

    /*
     * A two letter country code (ISO standard 3166). Required for users that
     * will be assigned licenses due to legal requirement to check for
     * availability of services in countries. Examples include: "US", "JP", and
     * "GB".
     */
    @JsonProperty(value = "usageLocation")
    private String usageLocation;

    /*
     * The given name for the user.
     */
    @JsonProperty(value = "givenName")
    private String givenName;

    /*
     * The user's surname (family name or last name).
     */
    @JsonProperty(value = "surname")
    private String surname;

    /*
     * A string value that can be used to classify user types in your
     * directory, such as 'Member' and 'Guest'.
     */
    @JsonProperty(value = "userType")
    private UserType userType;

    /*
     * Whether the account is enabled.
     */
    @JsonProperty(value = "accountEnabled")
    private Boolean accountEnabled;

    /*
     * The display name of the user.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The principal name of the user.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /*
     * The mail alias for the user.
     */
    @JsonProperty(value = "mailNickname")
    private String mailNickname;

    /*
     * The primary email address of the user.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /*
     * The sign-in names of the user.
     */
    @JsonProperty(value = "signInNames")
    private List<SignInName> signInNames;

    /**
     * Get the immutableId property: This must be specified if you are using a federated domain for the user's
     * userPrincipalName (UPN) property when creating a new user account. It is used to associate an on-premises Active
     * Directory user account with their Azure AD user object.
     *
     * @return the immutableId value.
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId property: This must be specified if you are using a federated domain for the user's
     * userPrincipalName (UPN) property when creating a new user account. It is used to associate an on-premises Active
     * Directory user account with their Azure AD user object.
     *
     * @param immutableId the immutableId value to set.
     * @return the UserInner object itself.
     */
    public UserInner withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get the usageLocation property: A two letter country code (ISO standard 3166). Required for users that will be
     * assigned licenses due to legal requirement to check for availability of services in countries. Examples include:
     * "US", "JP", and "GB".
     *
     * @return the usageLocation value.
     */
    public String usageLocation() {
        return this.usageLocation;
    }

    /**
     * Set the usageLocation property: A two letter country code (ISO standard 3166). Required for users that will be
     * assigned licenses due to legal requirement to check for availability of services in countries. Examples include:
     * "US", "JP", and "GB".
     *
     * @param usageLocation the usageLocation value to set.
     * @return the UserInner object itself.
     */
    public UserInner withUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
        return this;
    }

    /**
     * Get the givenName property: The given name for the user.
     *
     * @return the givenName value.
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * Set the givenName property: The given name for the user.
     *
     * @param givenName the givenName value to set.
     * @return the UserInner object itself.
     */
    public UserInner withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get the surname property: The user's surname (family name or last name).
     *
     * @return the surname value.
     */
    public String surname() {
        return this.surname;
    }

    /**
     * Set the surname property: The user's surname (family name or last name).
     *
     * @param surname the surname value to set.
     * @return the UserInner object itself.
     */
    public UserInner withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get the userType property: A string value that can be used to classify user types in your directory, such as
     * 'Member' and 'Guest'.
     *
     * @return the userType value.
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set the userType property: A string value that can be used to classify user types in your directory, such as
     * 'Member' and 'Guest'.
     *
     * @param userType the userType value to set.
     * @return the UserInner object itself.
     */
    public UserInner withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get the accountEnabled property: Whether the account is enabled.
     *
     * @return the accountEnabled value.
     */
    public Boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set the accountEnabled property: Whether the account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set.
     * @return the UserInner object itself.
     */
    public UserInner withAccountEnabled(Boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the displayName property: The display name of the user.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the user.
     *
     * @param displayName the displayName value to set.
     * @return the UserInner object itself.
     */
    public UserInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the userPrincipalName property: The principal name of the user.
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName property: The principal name of the user.
     *
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the UserInner object itself.
     */
    public UserInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the mailNickname property: The mail alias for the user.
     *
     * @return the mailNickname value.
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname property: The mail alias for the user.
     *
     * @param mailNickname the mailNickname value to set.
     * @return the UserInner object itself.
     */
    public UserInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the mail property: The primary email address of the user.
     *
     * @return the mail value.
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the mail property: The primary email address of the user.
     *
     * @param mail the mail value to set.
     * @return the UserInner object itself.
     */
    public UserInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the signInNames property: The sign-in names of the user.
     *
     * @return the signInNames value.
     */
    public List<SignInName> signInNames() {
        return this.signInNames;
    }

    /**
     * Set the signInNames property: The sign-in names of the user.
     *
     * @param signInNames the signInNames value to set.
     * @return the UserInner object itself.
     */
    public UserInner withSignInNames(List<SignInName> signInNames) {
        this.signInNames = signInNames;
        return this;
    }
}
