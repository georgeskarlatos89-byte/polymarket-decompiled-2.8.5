package com.polymarket.usdependencies;

import com.polymarket.clients.GeoActionScope;
import com.polymarket.clients.GeoGatedAction;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Async;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usdependencies/GeoComplianceGate;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoComplianceGate {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ GeoComplianceGate[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ GeoComplianceGate[] $values() {
        return new GeoComplianceGate[0];
    }

    static {
        GeoComplianceGate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private GeoComplianceGate(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static GeoComplianceGate valueOf(String str) {
        return (GeoComplianceGate) Enum.valueOf(GeoComplianceGate.class, str);
    }

    public static GeoComplianceGate[] values() {
        return (GeoComplianceGate[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 J:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0016JE\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nH\u0082 J\u000e\u0010\u0018\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0082 J\u0006\u0010\u001b\u001a\u00020\bJ\t\u0010\u001c\u001a\u00020\bH\u0082 ¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usdependencies/GeoComplianceGate$Companion;", "", "<init>", "()V", "verifyAppLaunch", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_Companion_verifyAppLaunch_0", "", "f_callback", "Lkotlin/Function1;", "needsPermission", "", "Swift_Companion_needsPermission_1", "verify", "action", "Lcom/polymarket/clients/GeoGatedAction;", "scope", "Lcom/polymarket/clients/GeoActionScope;", "shadowProps", "", "", "(Lcom/polymarket/clients/GeoGatedAction;Lcom/polymarket/clients/GeoActionScope;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_Companion_verify_2", "warmUpSilentVerification", "Swift_callback_Companion_warmUpSilentVerification_3", "Lkotlin/Function0;", "handleLocationChanged", "Swift_Companion_handleLocationChanged_4", "USDependencies"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native void Swift_Companion_handleLocationChanged_4();

        private final native boolean Swift_Companion_needsPermission_1();

        private final native void Swift_callback_Companion_verifyAppLaunch_0(Function1<? super GeoComplianceVerdict, Unit> f_callback);

        private final native void Swift_callback_Companion_verify_2(GeoGatedAction action, GeoActionScope scope, Map<String, String> shadowProps, Function1<? super GeoComplianceVerdict, Unit> f_callback);

        private final native void Swift_callback_Companion_warmUpSilentVerification_3(Function0<Unit> f_callback);

        public static final /* synthetic */ void access$Swift_callback_Companion_verifyAppLaunch_0(Companion companion, Function1 function1) {
            companion.Swift_callback_Companion_verifyAppLaunch_0(function1);
        }

        public static final /* synthetic */ void access$Swift_callback_Companion_verify_2(Companion companion, GeoGatedAction geoGatedAction, GeoActionScope geoActionScope, Map map, Function1 function1) {
            companion.Swift_callback_Companion_verify_2(geoGatedAction, geoActionScope, map, function1);
        }

        public static final /* synthetic */ void access$Swift_callback_Companion_warmUpSilentVerification_3(Companion companion, Function0 function0) {
            companion.Swift_callback_Companion_warmUpSilentVerification_3(function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object verify$default(Companion companion, GeoGatedAction geoGatedAction, GeoActionScope geoActionScope, Map map, Continuation continuation, int i, Object obj) {
            if ((i & 2) != 0) {
                geoActionScope = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.verify(geoGatedAction, geoActionScope, map, continuation);
        }

        public final void handleLocationChanged() {
            Swift_Companion_handleLocationChanged_4();
        }

        public final boolean needsPermission() {
            return Swift_Companion_needsPermission_1();
        }

        public final Object verify(GeoGatedAction geoGatedAction, GeoActionScope geoActionScope, Map<String, String> map, Continuation<? super GeoComplianceVerdict> continuation) {
            return Async.INSTANCE.run(new GeoComplianceGate$Companion$verify$2(geoGatedAction, geoActionScope, map, null), continuation);
        }

        public final Object verifyAppLaunch(Continuation<? super GeoComplianceVerdict> continuation) {
            return Async.INSTANCE.run(new GeoComplianceGate$Companion$verifyAppLaunch$2(null), continuation);
        }

        public final Object warmUpSilentVerification(Continuation<? super Unit> continuation) {
            Object run = Async.INSTANCE.run(new GeoComplianceGate$Companion$warmUpSilentVerification$2(null), continuation);
            if (run == u85.COROUTINE_SUSPENDED) {
                return run;
            }
            return Unit.INSTANCE;
        }

        private Companion() {
        }
    }
}
