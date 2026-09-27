package com.socure.docv.capturesdk.common.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"getParcelableCompat", "T", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextUtilsKt {
    public static final <T> T getParcelableCompat(Intent intent, String str) {
        intent.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.h();
            throw null;
        }
        intent.getParcelableExtra(str);
        Intrinsics.h();
        throw null;
    }

    public static final <T> T getParcelableCompat(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.h();
            throw null;
        }
        bundle.getParcelable(str);
        Intrinsics.h();
        throw null;
    }
}
