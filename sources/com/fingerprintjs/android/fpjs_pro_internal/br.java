package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface br {
    bs component9(bz bzVar, Integer num, Integer num2, Function0<Unit> function0, Function0<Unit> function02);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class component9 {
        public static int a;
        public static int b;

        public static int a() {
            int i = a;
            int i2 = i % 6184982;
            a = i + 1;
            if (i2 != 0) {
                return b;
            }
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            b = maxMemory;
            return maxMemory;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.br$component9$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
            public static final AnonymousClass3 vD14832N6715 = new Lambda(0);

            public AnonymousClass3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                b();
                return Unit.INSTANCE;
            }

            public final void b() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.br$component9$4, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
            public static final AnonymousClass4 setPivotYN16904 = new Lambda(0);

            public AnonymousClass4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                b();
                return Unit.INSTANCE;
            }

            public final void b() {
            }
        }
    }
}
