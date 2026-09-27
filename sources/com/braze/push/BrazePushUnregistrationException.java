package com.braze.push;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0006\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/push/BrazePushUnregistrationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "isRetriable", "", "httpStatusCode", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "Z", "()Z", "Ljava/lang/Integer;", "getHttpStatusCode", "()Ljava/lang/Integer;", "android-sdk-base"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazePushUnregistrationException extends Exception {
    private final Integer httpStatusCode;
    private final boolean isRetriable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushUnregistrationException(String str, boolean z, Integer num) {
        super(str);
        str.getClass();
        this.isRetriable = z;
        this.httpStatusCode = num;
    }

    /* renamed from: isRetriable, reason: from getter */
    public final boolean getIsRetriable() {
        return this.isRetriable;
    }

    public /* synthetic */ BrazePushUnregistrationException(String str, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : num);
    }
}
