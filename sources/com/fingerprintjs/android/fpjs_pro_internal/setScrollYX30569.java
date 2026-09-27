package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import com.fingerprintjs.android.fpjs_pro_internal.eT28692;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hdi;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/setScrollYX30569;", "Lcom/fingerprintjs/android/fpjs_pro_internal/eT28692;", "f", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class setScrollYX30569 extends eT28692 {

    /* renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u001c\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/SystemPropertiesSignal$Companion;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/system_properties/SystemProperty;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/system_properties/SystemPropertiesResult;", Keys.KEY_SOCURE_RESULT, "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/SystemPropertiesSignal;", TicketDetailDestinationKt.LAUNCHED_FROM, "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/SystemPropertiesSignal;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569$a, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static int a = 0;
        public static int b = 1;
        public static int c;
        public static int d;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d7, code lost:
        
            defpackage.dmk.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00da, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        
            r12 = (java.util.List) ((com.fingerprintjs.android.fpjs_pro_internal.vD14832N6715) r12).component5;
            r0 = defpackage.c1c.a(kotlin.collections.CollectionsKt.w(r12));
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 16) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r0 = 16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        
            r2 = new java.util.LinkedHashMap(r0);
            r12 = r12.iterator();
            r0 = com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.a;
            r3 = (r0 & 61) + (r0 | 61);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (r12.hasNext() == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.b = (com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.a + 115) % 128;
            r0 = (com.fingerprintjs.android.fpjs_pro_internal.f1) r12.next();
            r0.getClass();
            r3 = com.fingerprintjs.android.fpjs_pro_internal.f1.c;
            r4 = (r3 ^ 21) + ((r3 & 21) << 1);
            com.fingerprintjs.android.fpjs_pro_internal.f1.d = r4 % 128;
            r4 = r4 % 2;
            r3 = r0.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        
            if (r4 != 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        
            r4 = 70 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            r4 = new kotlin.Pair(r3, (java.lang.String) com.fingerprintjs.android.fpjs_pro_internal.f1.a(new java.lang.Object[]{r0}, -1494755291, b(), b(), b(), b(), 1494755292));
            r2.put(r4.getFirst(), r4.getSecond());
            r0 = com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.a;
            r3 = ((r0 | 65) << 1) - (r0 ^ 65);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
        
            r0 = new com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569(r2, com.fingerprintjs.android.fpjs_pro_internal.eT28692.a.b.d, null);
            r12 = com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.b;
            r2 = (r12 ^ 25) + ((r12 & 25) << 1);
            com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569.Companion.a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
        
            if ((r2 % 2) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0018, code lost:
        
            if ((r12 instanceof com.fingerprintjs.android.fpjs_pro_internal.vD14832N6715) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
        
            if ((r12 instanceof com.fingerprintjs.android.fpjs_pro_internal.vD14832N6715) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x00c7, code lost:
        
            if ((r12 instanceof com.fingerprintjs.android.fpjs_pro_internal.setPivotYN16904) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x00c9, code lost:
        
            r12 = (java.lang.Throwable) ((com.fingerprintjs.android.fpjs_pro_internal.setPivotYN16904) r12).D8871;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x00d6, code lost:
        
            return new com.fingerprintjs.android.fpjs_pro_internal.setScrollYX30569(null, com.fingerprintjs.android.fpjs_pro_internal.eT28692.a.d.d, null);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static setScrollYX30569 a(D8871 d8871) {
            int i = b + 1;
            a = i % 128;
            if (i % 2 != 0) {
                int i2 = 44 / 0;
            }
        }

        public static int b() {
            int i = c;
            int i2 = i % 9482956;
            c = i + 1;
            if (i2 != 0) {
                return d;
            }
            int a2 = hdi.a();
            d = a2;
            return a2;
        }
    }

    static {
        if (((0 - (-56)) - 1) % 2 != 0) {
        } else {
            throw null;
        }
    }

    public setScrollYX30569(Map map, eT28692.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        super(C1722.tc.e.setPivotYN16904(), map, aVar);
    }
}
