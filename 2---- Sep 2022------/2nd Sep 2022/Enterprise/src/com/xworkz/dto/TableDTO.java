package com.xworkz.dto;

public class TableDTO {

//	DTO with 2 properties check
//	DTO (Note): 1. All variables have to be private.
//				2.DTO class will not have any methods in it.
//				3.Use setters and getters to initialise and to get value.
//				4.Default constructor and parameterised Constructor must be present.
//				5.DTO class must be serialisable(to be thought in Interfaces).
				
	private String name;
	private String place;
	private String makeof;
	private String color;
	private String shape;
	private String tableDesign;
	private String specialFeature;
	private String baseType;
	private String finishType;
	private String modelName;
	private String size;
	private String manufacturerName;
	private String manufacturerPlace;
	private String origin;
	private String gstNumber;
	private String packerAddress;
	private String genericName;
	private String orderedFrom;
	private Double price;
	private Double weight;
	private Double noOfBoxes;
	private Integer rating;
	private Boolean isItCosty;
	private Boolean isItBlackInColor;
	private Boolean isItHard;
	private Boolean isItLightWeight;
	private Boolean isItEasyToCarry;
	private Boolean isItOrderedOnline;
	private Boolean isItEasyToReturn;
	private Boolean isThereAnyWarranty;
	private Boolean isItFoldable;
	private Boolean isItAvailableInLocalShop;
	private Boolean isThereAnyDiscount;
	private Boolean isItChinaProduct;
	private Boolean isItSmall;
	private Boolean doUWishToGiveFeedback;
	private Boolean doYouGive5rating;

	public TableDTO() {
		super();
	}

	public TableDTO(String name, String place, String makeof, String color, String shape, String tableDesign,
			String specialFeature, String baseType, String finishType, String modelName, String size,
			String manufacturerName, String manufacturerPlace, String origin, String gstNumber, String packerAddress,
			String genericName, String orderedFrom, Double price, Double weight, Double noOfBoxes, Integer rating,
			Boolean isItCosty, Boolean isItBlackInColor, Boolean isItHard, Boolean isItLightWeight,
			Boolean isItEasyToCarry, Boolean isItOrderedOnline, Boolean isItEasyToReturn, Boolean isThereAnyWarranty,
			Boolean isItFoldable, Boolean isItAvailableInLocalShop, Boolean isThereAnyDiscount,
			Boolean isItChinaProduct, Boolean isItSmall, Boolean doUWishToGiveFeedback, Boolean doYouGive5rating) {
		super();
		this.name = name;
		this.place = place;
		this.makeof = makeof;
		this.color = color;
		this.shape = shape;
		this.tableDesign = tableDesign;
		this.specialFeature = specialFeature;
		this.baseType = baseType;
		this.finishType = finishType;
		this.modelName = modelName;
		this.size = size;
		this.manufacturerName = manufacturerName;
		this.manufacturerPlace = manufacturerPlace;
		this.origin = origin;
		this.gstNumber = gstNumber;
		this.packerAddress = packerAddress;
		this.genericName = genericName;
		this.orderedFrom = orderedFrom;
		this.price = price;
		this.weight = weight;
		this.noOfBoxes = noOfBoxes;
		this.rating = rating;
		this.isItCosty = isItCosty;
		this.isItBlackInColor = isItBlackInColor;
		this.isItHard = isItHard;
		this.isItLightWeight = isItLightWeight;
		this.isItEasyToCarry = isItEasyToCarry;
		this.isItOrderedOnline = isItOrderedOnline;
		this.isItEasyToReturn = isItEasyToReturn;
		this.isThereAnyWarranty = isThereAnyWarranty;
		this.isItFoldable = isItFoldable;
		this.isItAvailableInLocalShop = isItAvailableInLocalShop;
		this.isThereAnyDiscount = isThereAnyDiscount;
		this.isItChinaProduct = isItChinaProduct;
		this.isItSmall = isItSmall;
		this.doUWishToGiveFeedback = doUWishToGiveFeedback;
		this.doYouGive5rating = doYouGive5rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMakeof() {
		return makeof;
	}

	public void setMakeof(String makeof) {
		this.makeof = makeof;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getTableDesign() {
		return tableDesign;
	}

	public void setTableDesign(String tableDesign) {
		this.tableDesign = tableDesign;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public String getFinishType() {
		return finishType;
	}

	public void setFinishType(String finishType) {
		this.finishType = finishType;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerPlace() {
		return manufacturerPlace;
	}

	public void setManufacturerPlace(String manufacturerPlace) {
		this.manufacturerPlace = manufacturerPlace;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getPackerAddress() {
		return packerAddress;
	}

	public void setPackerAddress(String packerAddress) {
		this.packerAddress = packerAddress;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getOrderedFrom() {
		return orderedFrom;
	}

	public void setOrderedFrom(String orderedFrom) {
		this.orderedFrom = orderedFrom;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getNoOfBoxes() {
		return noOfBoxes;
	}

	public void setNoOfBoxes(Double noOfBoxes) {
		this.noOfBoxes = noOfBoxes;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Boolean getIsItCosty() {
		return isItCosty;
	}

	public void setIsItCosty(Boolean isItCosty) {
		this.isItCosty = isItCosty;
	}

	public Boolean getIsItBlackInColor() {
		return isItBlackInColor;
	}

	public void setIsItBlackInColor(Boolean isItBlackInColor) {
		this.isItBlackInColor = isItBlackInColor;
	}

	public Boolean getIsItHard() {
		return isItHard;
	}

	public void setIsItHard(Boolean isItHard) {
		this.isItHard = isItHard;
	}

	public Boolean getIsItLightWeight() {
		return isItLightWeight;
	}

	public void setIsItLightWeight(Boolean isItLightWeight) {
		this.isItLightWeight = isItLightWeight;
	}

	public Boolean getIsItEasyToCarry() {
		return isItEasyToCarry;
	}

	public void setIsItEasyToCarry(Boolean isItEasyToCarry) {
		this.isItEasyToCarry = isItEasyToCarry;
	}

	public Boolean getIsItOrderedOnline() {
		return isItOrderedOnline;
	}

	public void setIsItOrderedOnline(Boolean isItOrderedOnline) {
		this.isItOrderedOnline = isItOrderedOnline;
	}

	public Boolean getIsItEasyToReturn() {
		return isItEasyToReturn;
	}

	public void setIsItEasyToReturn(Boolean isItEasyToReturn) {
		this.isItEasyToReturn = isItEasyToReturn;
	}

	public Boolean getIsThereAnyWarranty() {
		return isThereAnyWarranty;
	}

	public void setIsThereAnyWarranty(Boolean isThereAnyWarranty) {
		this.isThereAnyWarranty = isThereAnyWarranty;
	}

	public Boolean getIsItFoldable() {
		return isItFoldable;
	}

	public void setIsItFoldable(Boolean isItFoldable) {
		this.isItFoldable = isItFoldable;
	}

	public Boolean getIsItAvailableInLocalShop() {
		return isItAvailableInLocalShop;
	}

	public void setIsItAvailableInLocalShop(Boolean isItAvailableInLocalShop) {
		this.isItAvailableInLocalShop = isItAvailableInLocalShop;
	}

	public Boolean getIsThereAnyDiscount() {
		return isThereAnyDiscount;
	}

	public void setIsThereAnyDiscount(Boolean isThereAnyDiscount) {
		this.isThereAnyDiscount = isThereAnyDiscount;
	}

	public Boolean getIsItChinaProduct() {
		return isItChinaProduct;
	}

	public void setIsItChinaProduct(Boolean isItChinaProduct) {
		this.isItChinaProduct = isItChinaProduct;
	}

	public Boolean getIsItSmall() {
		return isItSmall;
	}

	public void setIsItSmall(Boolean isItSmall) {
		this.isItSmall = isItSmall;
	}

	public Boolean getDoUWishToGiveFeedback() {
		return doUWishToGiveFeedback;
	}

	public void setDoUWishToGiveFeedback(Boolean doUWishToGiveFeedback) {
		this.doUWishToGiveFeedback = doUWishToGiveFeedback;
	}

	public Boolean getDoYouGive5rating() {
		return doYouGive5rating;
	}

	public void setDoYouGive5rating(Boolean doYouGive5rating) {
		this.doYouGive5rating = doYouGive5rating;
	}

	@Override
	public int hashCode() {
		return 369;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("----Object is not Null----");
			if (obj instanceof TableDTO) {
				System.out.println("Object is of Table type");
				TableDTO casted = (TableDTO) obj;
				if (casted.name.equals(this.name)&&(casted.color.equals(this.color))) {
					System.out.println("Both are Same");
					return true;
				} else {
					System.out.println("Both are Different");
				}
			} else {
				System.out.println("Object is Not of Table type");
			}
		} else {
			System.out.println("****Object is Null****");
		}
		return super.equals(obj);
	}

}
