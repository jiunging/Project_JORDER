/*

메인화면에서 메뉴선택할 때마다 화면전환

*/


const menufood = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order1.food?type=anju");
    document.getElementById("content__title").setAttribute("src" , "../title/mainfood.jsp");
    document.getElementById("menu__food").style = "color : black; background-color : white";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menustick = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order2.food?type=stick")
    document.getElementById("content__title").setAttribute("src" , "../title/stick.jsp")
    document.getElementById("menu__stick").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menufried = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order3.food?type=fried")
    document.getElementById("content__title").setAttribute("src" , "../title/fried.jsp")
    document.getElementById("menu__fried").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menupancake = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order4.food?type=pancake")
    document.getElementById("content__title").setAttribute("src" , "../title/pancake.jsp")
    document.getElementById("menu__pancake").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menurice = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order5.food?type=rice")
    document.getElementById("content__title").setAttribute("src" , "../title/rice.jsp")
    document.getElementById("menu__rice").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menudesert = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order6.food?type=desert")
    document.getElementById("content__title").setAttribute("src" , "../title/desert.jsp")
    document.getElementById("menu__desert").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menubeverage = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order7.food?type=beverage")
    document.getElementById("content__title").setAttribute("src" , "../title/beverage.jsp")
    document.getElementById("menu__beverage").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__drink").style = "color : white; background-color : #298eb5";
}

const menudrink = () => {
    document.getElementById("content__frame").setAttribute("src" , "../order/order8.food?type=drink")
    document.getElementById("content__title").setAttribute("src" , "../title/drink.jsp")
    document.getElementById("menu__drink").style = "color : black; background-color : white";
    document.getElementById("menu__food").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__stick").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__fried").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__pancake").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__rice").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__desert").style = "color : white; background-color : #298eb5";
    document.getElementById("menu__beverage").style = "color : white; background-color : #298eb5";
}

const menuCall = () => {
	document.getElementById("content__frame").setAttribute("src" , "../order/call.jsp")
	document.getElementById("content__title").setAttribute("src" , "../title/call.jsp")
}