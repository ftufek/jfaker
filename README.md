## jfaker - Fake Data Generator for Java

Based on the [Faker.js](https://github.com/Marak/Faker.js/) library.

## Usage

```java
JFaker faker = new JFaker();
faker.Name.findName();
faker.Lorem.words(10);
```

## API
* Name
	* firstName
	* lastName
	* findName

* Address
	* zipCode
	* zipCodeFormat
	* city
	* streetName
	* streetAddress
	* secondaryAddress
	* brState
	* ukCounty
	* ukCountry
	* usState
	* latitude
	* longitude

* PhoneNumber
	* phoneNumber
	* phoneNumberFormat

* Internet
	* email
	* userName
	* domainName
	* domainWord
	* ip

* Company
	* suffixes
	* companyName
	* companySuffix
	* catchPhrase
	* bs

* Lorem
	* words
	* sentence
	* sentences
	* paragraph
	* paragraphs
