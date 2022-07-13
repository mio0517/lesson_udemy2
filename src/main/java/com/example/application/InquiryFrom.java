package com.example.application;


public class InquiryFrom {

  @Size (min = 1, max = 20, message = "Please input 20characters pr less")
  private String name;

  @NotNull
  @Email(message = "Invalid E-mail Format")
  private String email;

  @NotNull
  private String contents;

  public InquiryFrom() {

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
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }

}

