# <span style="font-size: 40px;">**Дарко Филипчев 173191**</span>


# <span style="font-size: 25px;">**Control Flow Graph** </span> 

[Diagram Picture](https://github.com/Daree10/SI_2023_lab2_111111/assets/63493997/ecf362f0-694f-4089-ad31-ce2532ab76c6)

# <span style="font-size: 25px;">**Цикломатска Комплексност**</span> 

  Кодот има цикломатска комплексонст од 3.

  Најпрво треба да ги разгледаме точките на одлучување.
  - Првата точка на одлука е настанот if 
  **if (user==null || user.getPassword()==null || user.getEmail()==null){
    throw new RuntimeException("Mandatory information missing!");
  }**
  
  - Втората точка е другиот if настан 
  **if (user.getUsername()==null){
    user.setUsername(user.getEmail());
  }**
  
  - Третата точка е наредниот if 
  **if (user.getUsername()==null){
    user.setUsername(user.getEmail());
  }**
  
  - Четвртата точка на одлучување е if
  **if (existingUser.getUsername() == user.getUsername()) {
    same += 1;
  }**
  
  - Петта точка на одлучување 
  **if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {
    return false;
  }**
  
  - Шестта и последна точка е настанот
  **f (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {
    return false;
  }**
  
  **Сумирајќи ги сите точки на одлучување, добиваме вкупен број на патеки: 2 + 2 + 2 + 2 + 2 + 2 = 12. Според формулата за цикломатската комплексност (V = E - N + 2), каде што Е е бројот на врски во CFG, а N е бројот на јазли, цикломатската комплексност на овој код изнесува 12 - 11 + 2 = 3.**
  
# <span style="font-size: 25px;">**Тест случаи според критериумот Every statement**</span> 

-Тест случај за user да биде null:
**Input:** user = null, allUsers = []
**Output:** RuntimeException("Mandatory information missing!")

-Тест случај за password на user да биде null:
**Input:** user = User("testuser", null, "test@example.com"), allUsers = []
**Output:** RuntimeException("Mandatory information missing!")

-Тест случај за email на user да биде null:
**Input:** user = User("testuser", "password123", null), allUsers = []
**Output:** RuntimeException("Mandatory information missing!")

-Тест случај за username на user да биде null:
**Input:** user = User(null, "password123", "test@example.com"), allUsers = []
**Output:** user.getUsername() = "test@example.com"

-Тест случај за валиден user со уникатен е-пошта и корисничко име:
**Input:** user = User("testuser", "password123", "test@example.com"), allUsers = []
**Output:** function(user, allUsers) = true

-Тест случај за валиден user со постоечка е-пошта:
**Input:** user = User("testuser", "password123", "test@example.com"), allUsers = [User("existinguser", "password456", "test@example.com")]
**Output:** function(user, allUsers) = false

-Тест случај за валиден user со постоечко корисничко име:
**Input:** user = User("testuser", "password123", "test@example.com"), allUsers = [User("testuser", "password456", "different@example.com")]
**Output:** function(user, allUsers) = false

-Тест случај за password кој содржи корисничкото име во мали букви:
**Input:** user = User("testuser", "password123", "test@example.com"), allUsers = []
**Output:** function(user, allUsers) = false

-Тест случај за должината на password да биде помала од 8 карактери:
**Input:** user = User("testuser", "pass", "test@example.com"), allUsers = []
**Output:** function(user, allUsers) = false

-Тест случај за password кој содржи специјален знак и не содржи празно место:
**Input:** user = User("testuser", "password!", "test@example.com"), allUsers = []
**Output:** function(user, allUsers) = true

-Тест случај за password кој содржи празно место:
**Input:** user = User("testuser", "pass word", "test@example.com"), allUsers = []
**Output:** function(user, allUsers) = false

# <span style="font-size: 25px;">**Тест случаи според критериумот Every path**</span> 

-Тест случај за user да биде null:
**Input:** user = null
**Output:** true

-Тест случај за password на user да биде null:
**Input:** user = User(null, null, "test@example.com")
**Output:** true

-Тест случај за email на user да биде null:
**Input:** user = User("testuser", "password123", null)
**Output:** true

-Тест случај за user да биде различен од null и сите атрибути да бидат различни од null:
**Input:** user = User("testuser", "password123", "test@example.com")
**Output:** false
