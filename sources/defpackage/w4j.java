package defpackage;

import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w4j extends xu0 {
    public final String c;
    public final String d;

    public w4j(String str) {
        super(str, 0);
        String str2;
        this.d = str;
        List d0 = StringsKt.d0(str, new String[]{"_"}, false, 3, 2);
        String str3 = (String) d0.get(0);
        String str4 = (String) d0.get(2);
        int hashCode = str3.hashCode();
        if (hashCode != -224813765) {
            if (hashCode != 1753018553) {
                if (hashCode == 1865400007 && str3.equals("sandbox")) {
                    str2 = "https://api.sandbox.braintreegateway.com/";
                    this.c = (str2 + "merchants/" + str4 + "/client_api/").concat("v1/configuration");
                    return;
                }
                throw new Exception("Tokenization Key contained invalid environment");
            }
            if (str3.equals("production")) {
                str2 = "https://api.braintreegateway.com/";
                this.c = (str2 + "merchants/" + str4 + "/client_api/").concat("v1/configuration");
                return;
            }
            throw new Exception("Tokenization Key contained invalid environment");
        }
        if (str3.equals("development")) {
            str2 = "http://10.0.2.2:3000/";
            this.c = (str2 + "merchants/" + str4 + "/client_api/").concat("v1/configuration");
            return;
        }
        throw new Exception("Tokenization Key contained invalid environment");
    }

    @Override // defpackage.xu0
    public final String a() {
        return this.d;
    }

    @Override // defpackage.xu0
    public final String b() {
        return this.c;
    }
}
