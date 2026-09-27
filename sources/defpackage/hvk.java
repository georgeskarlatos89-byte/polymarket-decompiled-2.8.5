package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum hvk {
    CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
    APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");

    private final String a;

    hvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
