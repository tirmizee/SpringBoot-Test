# SpringBoot-Test


### Naming Test Methods (การตั้งชื่อ Methods)

- [UnitOfWork_StateUnderTest_ExpectedBehavior]
- [ฟังชันที่ต้องการทดสอบ_อินพุตหรือสถานะ_ผลลัพธ์ที่คาดหวัง]
 
### Given, When, Then 

A test should contain three blocks which are separated by one empty line. Each block of code should be as short as possible. Use subfunctions to shorten these blocks.

- <b>Given (Input):</b> Test preparation like creating data or configure mocks
- <b>When (Action):</b> Call the method or action that you like to test
- <b>Then (Output):</b> Execute assertions to verify the correct output or behavior of the action.

### Reference

- https://frontbackend.com/spring-boot/spring-boot-2-junit-5-mockito
- https://phauer.com/2019/modern-best-practices-testing-java
- https://www.petrikainulainen.net/programming/testing/writing-clean-tests-naming-matters/
