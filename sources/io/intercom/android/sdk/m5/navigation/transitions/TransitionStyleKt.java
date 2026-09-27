package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import com.google.gson.Gson;
import defpackage.din;
import defpackage.e0d;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le0d;", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "TransitionArgNavType", "Le0d;", "getTransitionArgNavType", "()Le0d;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionStyleKt {
    private static final e0d TransitionArgNavType = new e0d() { // from class: io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt$TransitionArgNavType$1
        private final TransitionArgs toTransitionArgs(String transitionArgs) {
            Object fromJson = new Gson().fromJson(transitionArgs, (Class<Object>) TransitionArgs.class);
            fromJson.getClass();
            return (TransitionArgs) fromJson;
        }

        @Override // defpackage.e0d
        public TransitionArgs get(Bundle bundle, String key) {
            bundle.getClass();
            key.getClass();
            TransitionArgs transitionArgs = (TransitionArgs) din.b(bundle, key, TransitionArgs.class);
            if (transitionArgs == null) {
                return new TransitionArgs(null, null, null, null, 15, null);
            }
            return transitionArgs;
        }

        @Override // defpackage.e0d
        public TransitionArgs parseValue(String value) {
            value.getClass();
            return toTransitionArgs(value);
        }

        public void put(Bundle bundle, String key, TransitionArgs value) {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putParcelable(key, value);
        }

        @Override // defpackage.e0d
        public /* bridge */ /* synthetic */ Object parseValue(String str) {
            return parseValue(str);
        }

        @Override // defpackage.e0d
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Object obj) {
            put(bundle, str, (TransitionArgs) obj);
        }

        @Override // defpackage.e0d
        public /* bridge */ /* synthetic */ Object get(Bundle bundle, String str) {
            return get(bundle, str);
        }
    };

    public static final e0d getTransitionArgNavType() {
        return TransitionArgNavType;
    }
}
