package com.springGateWay.GateWay.Constant;

public class ErrorMessages {
    public static final String INTERNAL_SERVER_ERROR = "Something went wrong. Please try again later.";
    public static final String RESOURCE_NOT_FOUND = "Requested resource could not be found.";
    public static final String MISSING_REQUIRED_PARAMETERS = "Missing or Invalid value provided for required parameters";
    public static final String ALREADY_UP_TO_DATE = "Send updated value.";
    public static final String SCOPE_DELETED = "Scope already deleted.";
    public static final String ROLE_DELETED = "Role already deleted.";
    public static final String RESOURCE_DELETED = "Resource already deleted.";
    public static final String METHOD_NOT_ALLOWED = "Method Not Allowed";
    public static final String INVALID_TOKEN = "Invalid user token";
    public static final String UNAUTHORIZED = "Invalid Credentials";
    public static final String USER_LOCKED = "Account Locked";
    public static final String INVALID_CAPTCHA = "Invalid Captcha";
    public static final String INVALID_OTP = "Invalid OTP";
    public static final String UNAUTHORIZED_ACCESS = "User doesn't have access to requested api";

    public static final String CUSTOMER_NAME_EMPTY = "Organization name cannot be empty";

    public static final String CUSTOMER_ID_EMPTY = "Organization id cannot be empty";


    public static final String USERNAME_ERR_STRING = "user name and password doesn't match";
	public static final String PASSWORD_ERR_STRING = "user name and password doesn't match";
	public static final String BAD_AUTH_CREDENTIALS = "Bad auth credentials";
	public static final String PASSWORD_CREDENTIALS = "Sorry,that password is not strong enough.Password must be at least 8 characher long";


    //Supplier Registration Error
    public static final String FIRST_NAME_NULL_ERROR = "First Name cannot be empty";
    public static final String LAST_NAME_NULL_ERROR = "Last Name cannot be empty";
    public static final String EMAIL_NULL_ERROR = "Email cannot be empty";
    public static final String COUNTRY_NULL_ERROR = "Country cannot be empty";
    public static final String USER_NAME_NULL_ERROR = "UserName cannot be empty";
    public static final String PASSWORD_NULL_ERROR = "Password cannot be empty";
    public static final String LEGAL_ENTITY_NAME_NULL_ERROR = "Legal entity name cannot be empty";

    public static final String COUNTRY_OF_REGISTRATION_NULL_ERROR = "Country Of Registration cannot be empty";
    public static final String COMPANY_REGISTRATION_NULL_ERROR = "Company registration cannot be empty";
    public static final String TAX_PAYER_ID_NUMBER_NULL_ERROR = "Tax payer id number cannot be empty ";
    public static final String STREET_ADDRESS_NULL_ERROR = "Street address cannot be empty";

    public static final String CITY_NULL_ERROR = "City cannot be empty";
    public static final String STATE_NULL_ERROR = "State cannot be empty";
    public static final String ZIP_NULL_ERROR = "zip cannot be empty";
    public static final String COUNTRY_OF_ORIGIN_NULL_ERROR = "Country Of origin cannot be empty";


    public static final String BANKING_REGION_NULL_ERROR = "Banking region cannot be empty";
    public static final String PAYMENT_METHOD_NULL_ERROR = "Payment method cannot be empty";
    public static final String PAYMENT_EFFECTIVE_DATE_NULL_ERROR = "Payment effective date cannot be empty";
    public static final String BANK_NAME_NULL_ERROR = "Bank Name cannot be empty";
    public static final String BANK_BRANCH_NULL_ERROR = "Bank branch cannot be empty";
    public static final String NAME_ON_BANK_ACCOUNT_NULL_ERROR ="Name on bank account cannot be empty" ;
    public static final String BANK_ROUTING_NUMBER_NULL_ERROR = "Bank routing number cannot be empty";
    public static final String SWIFT_CODE_NULL_ERROR = "SWIFT code cannot be empty";
    public static final String SWIFT_ADDRESS_NULL_ERROR = "SWIFT address cannot be empty";
    public static final String BANK_ACCOUNT_NUMBER_NULL_ERROR = "Bank account number cannot be empty";
    public static final String CORRESPONDENT_ACCOUNT_NULL_ERROR = "Correspondent account cannot be empty";

    public static final String CLEARING_CODE_NULL_ERROR = "Clearing Code cannot be empty";
    public static final String IBAN_NULL_ERROR = "IBAN cannot be empty";
    public static final String CLABE_NULL_ERROR = "CLABE cannot be empty";
    public static final String PHONE_NUMBER_NULL_ERROR = "Phone Number cannot be empty";
    public static final String FILE_MISMATCH_ERROR = "File Name and Format should be same as template";

    public static final String FILE_SAVING_ERROR = "Error While Saving File";

    public static final String SUPPLIER_ID_ERROR="Supplier Id can not be Null";

    public static final String SUPPLIER_NAME_ERROR = "Supplier name can not be Null";
    public  static final String SUPPLIER_QUALIFIED_STATUS="supplier qualified status can not be null";
    public static final String ASSIGNED_ID="Assigned Id or Assigned Name  can't be Null";

    public static final String LIST_OF_SUPPLIERS_EMPTY="Supplier List can not be Empty";

    public static final String INVALID_LIFE_CYCLE_STATUS = "Lifecycle Status is invalid";

    public static final String RESOURCE_NOT_FOUND_OF_SUPPLIER = "Requested supplier details not found at supplier :: ";

    public static final String SUPPLIER_DETAILS_NOT_NULL = "The Supplier Details Not Provided ";
    public static final String SUPPLIER_Name_NOT_NULL = "Supplier name should not be null";
    public static final String SUPPLIER_EMAIL_NOT_NULL = "EMAIL should not be null";
    public static final String SUPPLIER_PHONE_NUMBER_NOT_NULL = "PHONE NUMBER should not be null";
    public static final String SUPPLIER_LOCATION_NOT_NULL = "LOCATION should not be null";
   public static final String SUPPLIER_DETAILS_NOT_FOUND="Supplier NoT found for given Id";

    public static final String INVALID_EMAIL = "Invalid email address. Please enter a valid email address.";

    public static final String SUPPLIER_LIST_ERROR = "Supplier(s) list cannot be empty.";

    public static final String SUPPLIER_NOT_FOUND="Supplier not found for given SupplierId";

    public static final String SUPPLIER_NAME_NOT_FOUND = "Supplier with this supplier id doesn't have a value for Organization name.";
    public static final String SUPPLIER_ADDRESS_NOT_FOUND = "Supplier with this supplier id doesn't have a value for address.";
    public static final String SUPPLIER_EMAIL_NOT_FOUND = "Supplier with this supplier id doesn't have a value for email.";
    public static final String SUPPLIER_PHONE_NUMBER_NOT_FOUND = "Supplier with this supplier id doesn't have a value for phone number.";



    //Event Logs
    public static final String EVENT_UUID_ERROR="event Id can not be Null";
    public static final String EVENT_TYPE_NULL_ERROR = "Event type cannot be null.";
    public static final String EVENT_DETAILS_NULL_ERROR = "Event details cannot be null.";
    public static final String LOCATION_NULL_ERROR = "Location cannot be null.";
    public static final String SUPPLIER_ID_NOT_NULL = "Supplier ID cannot be null";
    public static final String EVENT_LOGS_NOT_FOUND_FOR_GIVEN_UUID = "Event Logs not found for given eventUuid";
    public static final String EVENT_LOGS_NOT_FOUND = "Event Logs not found";

    public static final String INVALID_START_END_DATE_ERROR = "startDate and endDate are invalid!";
    public static final String NULL_OFFSET_ERROR = "offset cannot be null";
    public static final String NULL_LIMIT_ERROR = "limit cannot be null";
    public static final String EVENT_LOGS_NULL = "Event logs list cannot be empty";

    public static final String APPLICATION_ID_NOT_FOUND = "Application Id Not present with given application Name";
    public static final String CUSTOMER_ID_NOT_NULL = "Organization Id can not be NULL";


    public static final String USER_DETAILS_NOT_FOUND = "No Users found";
    public static final String USERNAME_AND_CUSTOMER_ID_NULL_ERROR = "UserName and Organization Id can't be null";

    public static final String INACTIVE_ROLE_DELETE_ERROR = "Inactive role cannot be deleted";

    public static final String USER_VIEW_DETAILS_NOT_FOUND = "User Details Not Found";

    public static final String SIZE_OR_OFFSET_NULL_ERROR = "Size or Offset can't be Null";
    public static final String APPLICATION_ID_OR_CUSTOMER_ID_NULL  = "Application id / Organization id cannot be null or empty";
    public static final String ORGANIZATION_NOT_FOUND= "No such Organization with id ";
}
