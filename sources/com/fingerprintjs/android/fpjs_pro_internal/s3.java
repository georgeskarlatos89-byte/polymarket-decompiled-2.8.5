package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/ContentResolver;", "b", "()Landroid/content/ContentResolver;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class s3 extends Lambda implements Function0<ContentResolver> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context) {
        super(0);
        this.h = context;
    }

    public final ContentResolver b() {
        int i2 = i;
        int i3 = ((i2 | 19) << 1) - (i2 ^ 19);
        j = i3 % 128;
        int i4 = i3 % 2;
        ContentResolver contentResolver = this.h.getContentResolver();
        contentResolver.getClass();
        if (i4 != 0) {
            return contentResolver;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ ContentResolver invoke() {
        i = (j + 105) % 128;
        ContentResolver b = b();
        j = (i + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
        return b;
    }
}
