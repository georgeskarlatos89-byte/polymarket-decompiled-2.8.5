package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class oem {
    public static final uk c = new uk("ReviewService");
    public final dtn a;
    public final String b;

    public oem(Context context) {
        String str;
        this.b = context.getPackageName();
        uk ukVar = azn.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                ukVar.d("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        arrayList.add(str);
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        this.a = new dtn(context, c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ", ");
                            }
                        }
                    }
                    ukVar.d(sv6.n("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
                    return;
                }
                ukVar.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                ukVar.d("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            ukVar.d("Play Store package is not found.", new Object[0]);
        }
    }
}
