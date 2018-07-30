package com.dietel.ch17;//packaged for re use

public class AccountRecord
{
	private int account;
	private String firstName;
	private String lastName;
	private Double balance;

	// no-argument constructor calls other constructors with default values
	public AccountRecord(){
		this( 0,"", "", 0.0);
	}

	public AccountRecord(int account, String firstName, String lastName, Double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

	public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}