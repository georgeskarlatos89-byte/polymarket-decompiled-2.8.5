package defpackage;

import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.model.AddressField;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rh4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.SANDBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AddressField.Companion.Name.values().length];
        try {
            iArr2[AddressField.Companion.Name.AddressLine1.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AddressField.Companion.Name.AddressLine2.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AddressField.Companion.Name.City.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AddressField.Companion.Name.State.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AddressField.Companion.Name.Zip.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AddressField.Companion.Name.Country.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[AddressField.Companion.Name.Email.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[AddressField.Companion.Name.FirstName.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[AddressField.Companion.Name.LastName.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[AddressField.Companion.Name.Phone.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
