package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import bo.app.r;
import com.checkout.components.core.ui.FlowComponentFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.api.Keys;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class tw7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tw7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                return r.a(fq5.FEATURE_FLAGS, new StringBuilder("Starting migration for key: "));
            case 1:
                return "Migration for feature flags completed successfully";
            case 2:
                return "Failed to migrate feature flags storage to DataStore.";
            case 3:
                return r.a(fq5.FEATURE_FLAGS_IMPRESSIONS_MAP, new StringBuilder("Starting migration for key: "));
            case 4:
                return "Migration for Feature Flags impression map completed successfully";
            case 5:
                return "Failed to migrate Feature Flags impression map to DataStore.";
            case 6:
                return new yk0(b2i.a, 0);
            case 7:
                return nsc.Companion.serializer();
            case 8:
                return go5.f("com.stripe.android.uicore.address.FieldType", jz7.values(), new String[]{"addressLine1", "addressLine2", PlaceTypes.LOCALITY, "dependentLocality", "postalCode", "sortingCode", "administrativeArea", Keys.KEY_NAME}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 9:
                return FinAnswerRowKt.f();
            case 10:
                return FinAnswerRowKt.g();
            case 11:
                return new yk0(k28.e, 0);
            case 12:
                return new yk0(e28.e, 0);
            case 13:
                return new yk0(z18.a, 0);
            case 14:
                int i = FinancialConnectionsSheetLiteActivity.d;
                return new x28(0);
            case 15:
                return Boolean.valueOf(ia8.d());
            case 16:
                return FlowComponentFactory.a();
            case 17:
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                return null;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 20:
                try {
                    Method method = (Method) so8.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return Long.valueOf(Calendar.getInstance().getTimeInMillis());
            case 22:
                ejk[] values = ejk.values();
                values.getClass();
                return new bh7("io.ktor.util.date.WeekDay", (Enum[]) values);
            case 23:
                kkc[] values2 = kkc.values();
                values2.getClass();
                return new bh7("io.ktor.util.date.Month", (Enum[]) values2);
            case 24:
                return Unit.INSTANCE;
            case 25:
                gt8.a.setValue(null);
                return Unit.INSTANCE;
            case 26:
                gt8.a.setValue(null);
                return Unit.INSTANCE;
            case 27:
                return h39.Companion.serializer();
            case 28:
                return c39.Companion.serializer();
            default:
                return k39.Companion.serializer();
        }
    }
}
