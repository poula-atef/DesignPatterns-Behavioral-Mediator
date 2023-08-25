# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Mediator Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي مجموعة classes و كل واحد فيهم بيكلم الباقيين .. ف بنستخدم ال pattern ده عشان نعمل mediator class واحد بيكلم كل ال classes دول و اي واحد منهم عايز يكلم التاني يكلم ال mdiator و يقوله عايز يكلم مين و هيقدر يكلمه من خلاله (زي المثال الموضح في الكود وهو الطائرات و برج الارسال)
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال Plane Class
  - ال package بتاعت ال mediator:
    - ال Mediator Interface
    - ال AirPort Mediator و ده بيعمل implementation لل Mediator Interface
