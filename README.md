# SpringBoot-Test


### Naming Test Methods (การตั้งชื่อ Methods)

- [UnitOfWork_StateUnderTest_ExpectedBehavior]
- [ฟังชันที่ต้องการทดสอบ_อินพุตหรือสถานะ_ผลลัพธ์ที่คาดหวัง]
 
### Test method block (Given, When, Then) 

A test should contain three blocks which are separated by one empty line. Each block of code should be as short as possible. Use subfunctions to shorten these blocks.

- <b>Given (Input):</b> Test preparation like creating data or configure mocks (เตรียมการทดสอบเช่นการสร้างข้อมูลสำหรับทดสอบหรือกำหนดค่า mocks)
- <b>When (Action):</b> Call the method or action that you like to test (เรียก method ที่คุณต้องการทดสอบ)
- <b>Then (Output):</b> Execute assertions to verify the correct output or behavior of the action.

### Examples

- simple naming test method

      @Test
      void getByFirstname_shouldReturnValue() {

          // Given
          final String firstname = "Pratya";

          // when 
          UserDTO actaulResult = userDao.getByFirstname(firstname);

          //then
          assertThat(actaulResult).isNotNull();

      }

### Reference

- https://frontbackend.com/spring-boot/spring-boot-2-junit-5-mockito
- https://phauer.com/2019/modern-best-practices-testing-java
- https://www.petrikainulainen.net/programming/testing/writing-clean-tests-naming-matters/
- https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#spring-testing-annotation-sql
