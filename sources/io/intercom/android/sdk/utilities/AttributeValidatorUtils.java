package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.models.AttributeType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class AttributeValidatorUtils {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])", 2);
    private static final Pattern VALID_WEBSITE_REGEX = Pattern.compile("^(https?://)?(www\\.)?([\\w]+\\.)+[\u200c\u200b\\w]{2,63}/?$");
    private static final Pattern VALID_NUMBER_REGEX = Pattern.compile("^[-+]?\\d+$");
    private static final Pattern VALID_FLOAT_REGEX = Pattern.compile("^[-+]?\\d*\\.?\\d*$");

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface AttributeResponseCode {
        public static final int INVALID_COUNTRY_CODE = 6;
        public static final int INVALID_EMAIL = 2;
        public static final int INVALID_NUMBER = 3;
        public static final int INVALID_NUMBER_HAS_TOO_MANY_DIGITS = 5;
        public static final int INVALID_NUMBER_NEEDS_PREFIX = 4;
        public static final int INVALID_NUMBER_NOT_ENOUGH_DIGITS = 7;
        public static final int INVALID_STRING = 1;
        public static final int OK = 0;
    }

    public static int validateAttribute(String str, String str2) {
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1034364087:
                if (str2.equals(AttributeType.NUMBER)) {
                    c = 0;
                    break;
                }
                break;
            case 75849770:
                if (str2.equals(AttributeType.WEBSITE)) {
                    c = 1;
                    break;
                }
                break;
            case 96619420:
                if (str2.equals("email")) {
                    c = 2;
                    break;
                }
                break;
            case 97526364:
                if (str2.equals(AttributeType.FLOAT)) {
                    c = 3;
                    break;
                }
                break;
            case 106642798:
                if (str2.equals(AttributeType.PHONE)) {
                    c = 4;
                    break;
                }
                break;
            case 1958052158:
                if (str2.equals(AttributeType.INTEGER)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (!VALID_NUMBER_REGEX.matcher(str).matches()) {
                    return 3;
                }
                return 0;
            case 1:
                return !VALID_WEBSITE_REGEX.matcher(str).matches() ? 1 : 0;
            case 2:
                if (!VALID_EMAIL_ADDRESS_REGEX.matcher(str).matches()) {
                    return 2;
                }
                return 0;
            case 3:
                if (!VALID_FLOAT_REGEX.matcher(str).matches()) {
                    return 3;
                }
                return 0;
            case 4:
                return PhoneNumberValidator.validatePhoneNumber(str);
            case 5:
                try {
                    Integer.parseInt(str);
                    return 0;
                } catch (NumberFormatException unused) {
                    return 3;
                }
            default:
                return 0;
        }
    }
}
