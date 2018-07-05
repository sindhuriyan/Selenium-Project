package maven.apple1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class AppleBuy {
			public WebDriver driver;
			public AppleBuy(WebDriver driver){
		    this.driver=driver;
			}
			//selecting ipad//
			By Ipdselect=By.xpath("/html/body/nav/div/ul[2]/li[3]/a");
			//click on buy//
			By buy=By.xpath("/html/body/div[4]/section[1]/div[1]/div/span/a[2]");
			//select silver//
			By selectsilver=By.xpath("//input[@id='dimensionColor-silver']");
			By selectgb=By.xpath("//input[@id='Item2-dimensionCapacity-32gb']");
			By selectwificell=By.xpath("//input[@id='Item3-dimensionConnection-wificell']");
			By addapplecare=By.xpath("//button[@id='applecare_open']");
			By add=By.xpath("/html/body/overlay[5]/materializer/div/div[1]/div/materializer/accessory/div/div[1]/div[2]/div[2]/button");
			//By selectcontinue=By.xpath("//button[type='button']");
			By selectcontinue=By.xpath("/html/body/div[2]/div[7]/div/store-provider/step1-flagship/div[3]/summary-builder/div[3]/div[1]/div/div/div[1]/div/form/div/span/button");
		    By addtocart=By.xpath("/html/body/div[2]/sticky/div/div/div[2]/form/div/span/button");
		    By reviewbag=By.xpath("/html/body/div[3]/div[6]/sticky/div/div/div[2]/form/div/span/button");
		    By checkout=By.xpath("//button[@id='shoppingCart.actions.checkout']");
		    By contguest=By.xpath("//button[@id='guest-checkout']");
		    By continueshipping=By.xpath("/html/body/div[2]/div[3]/div/div[6]/div[1]/div[2]/div/div/div[3]/div/div/div/button");
		    By fn=By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.firstName']");
		    By ln=By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.lastName']");
		    By address=By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.street']");
		    By zipcode=By.xpath("//input[@id='checkout.shipping.addressSelector.newAddress.address.zipLookup.postalCode']");
		    By emailaddress=By.xpath("//input[@id='checkout.shipping.addressContactEmail.address.emailAddress']");
		    By contact=By.xpath("//input[@id='checkout.shipping.addressContactPhone.address.fullDaytimePhone']");
		    By continuepayment=By.xpath("/html/body/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/div/div/div[1]/div[4]/div/div/div/div/button");
		    By recommend=By.xpath("/html/body/div[2]/div[3]/div/div[3]/div/div/div/div/div[3]/button");
		    By clickoncreditoption=By.xpath("/html/body/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/fieldset[1]/div[2]/div[1]/div/div/div/label/div/div[1]/div[1]");
		    By entercreditnumber=By.name("cardNumber");
		    By expirydate=By.name("expiration");
		    By cvvno=By.name("securityCode");
		    
		    
			public WebElement Ipdselect(){
			return driver.findElement(Ipdselect);
		}
		
		public WebElement buy(){
			return driver.findElement(buy);
		}
		public WebElement selectsilver (){
			return driver.findElement(selectsilver);
			
	    }
		public WebElement selectgb (){
			return driver.findElement(selectgb);
		}
		public WebElement selectwificell (){
			return driver.findElement(selectwificell);
		}
		public WebElement addapplecare (){
			return driver.findElement(addapplecare);
		}
		public WebElement add (){
			return driver.findElement(add);
		}
		public WebElement selectcontinue (){
			return driver.findElement(selectcontinue);
		
		}
		public WebElement addtocart (){
			return driver.findElement(addtocart);

	}
		public WebElement reviewbag (){
			return driver.findElement(reviewbag);

	}
		public WebElement checkout(){
			return driver.findElement(checkout);
		}
		public WebElement contguest (){
			return driver.findElement(contguest);
		
	}
		public WebElement continueshipping (){
			return driver.findElement(continueshipping);
	}
		public WebElement fn(){
			return driver.findElement(fn);
	}
		public WebElement ln(){
			return driver.findElement(ln);
		}
		public WebElement address(){
			return driver.findElement(address);
		}
		public WebElement zipcode(){
			return driver.findElement(zipcode);
		}
		public WebElement emailaddress(){
			return driver.findElement(emailaddress);
		}
		public WebElement contact(){
			return driver.findElement(contact);
		}
		public WebElement continuepayment(){
			return driver.findElement(continuepayment);
		}
		public WebElement recommend(){
			return driver.findElement(recommend);
		}
		public WebElement clickoncreditoption(){
			return driver.findElement(clickoncreditoption);
		}
		public WebElement entercreditnumber(){
			return driver.findElement(entercreditnumber);
		}
		public WebElement expirydate(){
			return driver.findElement(expirydate);
		}
		public WebElement cvvno(){
			return driver.findElement(cvvno);
		}


}
