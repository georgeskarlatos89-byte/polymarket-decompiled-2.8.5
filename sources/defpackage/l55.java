package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import io.getstream.chat.android.models.AttachmentType;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class l55 {
    public static final List a = CollectionsKt.listOf("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome", "org.mozilla.firefox", "com.microsoft.emmx");
    public static final Set b = ArraysKt.l0(new String[]{AttachmentType.FILE, "content", "intent", "android-app"});

    public static final void a(Context context, String str) {
        context.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        String e = e(context, parse);
        vo0 vo0Var = new vo0();
        ((Intent) vo0Var.c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        bw4 i = vo0Var.i();
        if (e != null) {
            ((Intent) i.b).setPackage(e);
        }
        try {
            i.n0(context, parse);
        } catch (Exception unused) {
            d(context, str);
        }
    }

    public static final void b(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static final void c(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme != null) {
            str2 = scheme.toLowerCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (CollectionsKt.x(b, str2)) {
            m0.d("ContextUtils", "Refusing to open URL with blocked scheme: " + str2);
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (Exception e) {
            String host = parse.getHost();
            if (host == null) {
                host = "";
            }
            m0.e("ContextUtils", m51.k("Failed to open URL with system handler: ", str2, "://", host), e);
        }
    }

    public static final void d(Context context, String str) {
        context.getClass();
        str.getClass();
        Uri parse = Uri.parse(str);
        try {
            Intent intent = new Intent();
            parse.getClass();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addCategory("android.intent.category.BROWSABLE");
            String e = e(context, parse);
            if (e != null) {
                intent.setPackage(e);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            m0.e("ContextUtils", "No browser app found to open URL: " + str, e2);
        } catch (Exception e3) {
            m0.e("ContextUtils", "Failed to open URL: " + str, e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String e(Context context, Uri uri) {
        String str;
        context.getClass();
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        queryIntentActivities.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null) {
                str = activityInfo.packageName;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List M0 = CollectionsKt.M0(CollectionsKt.P0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : M0) {
            if (!Intrinsics.areEqual((String) obj, context.getPackageName())) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (arrayList2.contains((String) next)) {
                str = next;
                break;
            }
        }
        String str2 = str;
        if (str2 == null) {
            return (String) CollectionsKt.firstOrNull(arrayList2);
        }
        return str2;
    }
}
