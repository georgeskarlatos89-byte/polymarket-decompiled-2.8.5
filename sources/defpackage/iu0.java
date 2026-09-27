package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liu0;", "Lxt0;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class iu0 extends xt0 {
    public String a;
    public String b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iu0(String str, String str2) {
        this(0);
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        String str;
        String str2 = this.a;
        String str3 = this.b;
        if (!TextUtils.isEmpty(str3)) {
            str3.getClass();
            return str3;
        }
        if (str2 == null) {
            str = "a0.sdk.internal_error.unknown";
        } else {
            str = str2;
        }
        if (Intrinsics.areEqual("a0.sdk.internal_error.unknown", str)) {
            if (str2 == null) {
                str2 = "a0.sdk.internal_error.unknown";
            }
            return String.format("Received error with code %s", Arrays.copyOf(new Object[]{str2}, 1));
        }
        return "Failed with unknown error";
    }

    public iu0(int i) {
        super("An error occurred when trying to authenticate with the server.", null);
    }
}
