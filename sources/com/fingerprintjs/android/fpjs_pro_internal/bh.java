package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/bh;", "", "", "vD14832N6715", "()Ljava/lang/Long;", "component9"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class bh {

    /* renamed from: component9, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Long a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/bh$component9;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.bh$component9, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static bh setPivotYN16904(Companion companion, Integer num) {
            Long l;
            Long l2;
            Long e = bj.e();
            if (num != null) {
                l = Long.valueOf(num.intValue());
            } else {
                l = null;
            }
            if (e != null && l != null) {
                l2 = Long.valueOf(l.longValue() + e.longValue());
            } else {
                l2 = null;
            }
            return new bh(e, l2, null);
        }
    }

    public bh(Long l, Long l2, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = l2;
    }

    public final Long vD14832N6715() {
        Long l = this.a;
        if (l != null) {
            long longValue = l.longValue();
            Long e = bj.e();
            if (e != null) {
                return Long.valueOf(longValue - e.longValue());
            }
        }
        return null;
    }
}
