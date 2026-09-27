package io.intercom.android.sdk.models;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class CountryAreaCode {
    public static final CountryAreaCode UNKNOWN = new Builder().build();
    private List<String> areaCodes;
    private String code;
    private String dialCode;
    private String emoji;
    private int priority;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        List<String> areaCodes;
        String code;
        String dialCode;
        String emoji;
        Integer priority;

        public CountryAreaCode build() {
            return new CountryAreaCode(this);
        }
    }

    public CountryAreaCode(Builder builder) {
        int intValue;
        String str = builder.code;
        this.code = str == null ? "" : str;
        String str2 = builder.dialCode;
        this.dialCode = str2 != null ? str2 : "";
        String str3 = builder.emoji;
        this.emoji = str3 == null ? "🌎" : str3;
        Integer num = builder.priority;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        this.priority = intValue;
        this.areaCodes = new ArrayList();
        List<String> list = builder.areaCodes;
        if (list != null) {
            for (String str4 : list) {
                if (str4 != null) {
                    this.areaCodes.add(str4);
                }
            }
        }
    }

    public List<String> getAreaCodes() {
        return this.areaCodes;
    }

    public String getCode() {
        return this.code;
    }

    public String getDialCode() {
        return this.dialCode;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public int getPriority() {
        return this.priority;
    }
}
