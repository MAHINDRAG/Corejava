/**
 * 
 */


/**
 * Creating Object using Object literal
 */

var emp = {firstName:"Mahindra",lastName:"Gopisetty",Degree:"B.Tech",city:"kadapa"};
print("Object Creation using Object Literal")
print("FirstName:"+emp.firstName+", LastName:"+emp.lastName+", Degree:"+emp.Degree+", City:"+emp.city);

/**
 * Creating Object using new operator
 */

var emp = new Object();
emp.firstName = "Adithya";
emp.lastName = "Gopisetty";
emp.company = "Tecnotree";
emp.village = "GallavandlaPalli";

print("** Object Creation using new Operator **");
print("FirstName:"+emp.firstName+", LastName:"+emp.lastName+", Company:"+emp.company+", Village:"+emp.village);



/**
 * @param id
 * @param name
 * @param firstCompany
 * @param mobileNumber
 * @returns
 */
function employee(id,name,firstCompany,mobileNumber){
	this.id = id;
	this.name = name;
	this.firstCompany = firstCompany;
	this.mobileNumber = mobileNumber;
}

emp = new employee("HYD1008","Mahindra","Voziq","8147844352");
print("** Creating Object using Constructor **")
print("ID:"+emp.id+", Name:"+emp.name+", FirstCompany:"+emp.firstCompany+", MobileNumber:"+emp.mobileNumber);


 object1 = {a:1,b:2,c:3};
 object2 = {d:4,e:5,f:6};
 Object3 = Object.assign({c:7,a:9},Object1);
 Object4 = Object.assign({d:10,f:14,e:54},Object2);
 print("C:"+Object3.c,+", A:"+Object3.a);
 print("D:"+Object4.d+", F:"+Object4.e);





