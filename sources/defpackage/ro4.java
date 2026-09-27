package defpackage;

import bo.app.r;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.checkout.components.interfaces.model.contact.Country;
import com.google.mlkit.common.MlKitException;
import com.stripe.android.model.ConsumerSession$AuthenticationLevel;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ro4 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ro4(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c96, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zc7 zc7Var = zc7.a;
                zc7Var.getClass();
                return new h96(zc7Var);
            case 1:
                return new b96(new Object());
            case 2:
                return new Object();
            case 3:
                return fdn.b();
            case 4:
                throw new IllegalStateException("No local MarkdownAnimations");
            case 5:
                return new so4(1);
            case 6:
                throw new IllegalStateException("CompositionLocal ReferenceLinkHandler not present");
            case 7:
                throw new IllegalStateException("No local MarkdownColors");
            case 8:
                throw new IllegalStateException("No local MarkdownTypography");
            case 9:
                throw new IllegalStateException("No local Padding");
            case 10:
                throw new IllegalStateException("No local MarkdownDimens");
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return null;
            case 16:
                uq4.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 17:
                return new yk0(px4.a, 0);
            case MlKitException.UNSUPPORTED /* 18 */:
                return new yk0(k15.a, 0);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return ConsumerSession$AuthenticationLevel.Companion.serializer();
            case 20:
                return ConsumerSession$AuthenticationLevel.Companion.serializer();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new yk0(b2i.a, 0);
            case 22:
                return ConsumerSession$AuthenticationLevel.e();
            case 23:
                p15[] values = p15.values();
                values.getClass();
                return new bh7("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", (Enum[]) values);
            case 24:
                n15[] values2 = n15.values();
                values2.getClass();
                return new bh7("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", (Enum[]) values2);
            case 25:
                return ArraysKt.l0(new Country[]{Country.UNITED_STATES_OF_AMERICA, Country.CANADA, Country.AUSTRALIA});
            case 26:
                return Float.valueOf(1.0f);
            case 27:
                return ContentCardAdapter.e();
            case 28:
                return r.a(fq5.CONTENT_CARDS, new StringBuilder("Starting migration for key: "));
            default:
                return "Failed to migrate content cards storage to DataStore.";
        }
    }
}
