package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.appwebview.PolyBridgeV1;
import com.polymarket.appwebview.PolyWebBridge;
import com.polymarket.data.ETransaction;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import com.polymarket.usviewmodels.MidtermsRegion;
import com.polymarket.usviewmodels.PortfolioSummaryViewModel;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.radar.sdk.RadarTripOptions;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class iie implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ iie(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "🌐";
        String str6 = "";
        boolean z = true;
        String str7 = null;
        String str8 = null;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        String str9 = null;
        switch (this.a) {
            case 0:
                ETransaction eTransaction = (ETransaction) obj;
                eTransaction.getClass();
                return eTransaction.getId();
            case 1:
                rle rleVar = (rle) obj;
                rleVar.getClass();
                return rleVar.b();
            case 2:
                k95 k95Var = (k95) obj;
                k95Var.getClass();
                s95 s95Var = k95Var.a;
                String str10 = s95Var.a;
                str10.getClass();
                if (str10.length() == 2) {
                    int codePointAt = Character.codePointAt(str10, 0) - (-127397);
                    int codePointAt2 = Character.codePointAt(str10, 1) - (-127397);
                    char[] chars = Character.toChars(codePointAt);
                    chars.getClass();
                    char[] chars2 = Character.toChars(codePointAt2);
                    chars2.getClass();
                    int length = chars.length;
                    int length2 = chars2.length;
                    char[] copyOf = Arrays.copyOf(chars, length + length2);
                    System.arraycopy(chars2, 0, copyOf, length, length2);
                    str5 = new String(copyOf);
                }
                lj3 lj3Var = rle.a;
                String str11 = s95Var.a;
                str11.getClass();
                Map map = rle.b;
                String upperCase = str11.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                nle nleVar = (nle) map.get(upperCase);
                if (nleVar != null) {
                    str = nleVar.a;
                } else {
                    str = null;
                }
                if (str != null) {
                    str7 = sv6.n("  ", str, "  ");
                }
                return CollectionsKt.N(CollectionsKt.U(str5, str7), "", null, null, null, 62);
            case 3:
                rle rleVar2 = (rle) obj;
                rleVar2.getClass();
                return rleVar2.d();
            case 4:
                k95 k95Var2 = (k95) obj;
                k95Var2.getClass();
                s95 s95Var2 = k95Var2.a;
                String str12 = s95Var2.a;
                str12.getClass();
                if (str12.length() == 2) {
                    int codePointAt3 = Character.codePointAt(str12, 0) - (-127397);
                    int codePointAt4 = Character.codePointAt(str12, 1) - (-127397);
                    char[] chars3 = Character.toChars(codePointAt3);
                    chars3.getClass();
                    char[] chars4 = Character.toChars(codePointAt4);
                    chars4.getClass();
                    int length3 = chars3.length;
                    int length4 = chars4.length;
                    char[] copyOf2 = Arrays.copyOf(chars3, length3 + length4);
                    System.arraycopy(chars4, 0, copyOf2, length3, length4);
                    str5 = new String(copyOf2);
                }
                String str13 = k95Var2.b;
                lj3 lj3Var2 = rle.a;
                String str14 = s95Var2.a;
                str14.getClass();
                Map map2 = rle.b;
                String upperCase2 = str14.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                nle nleVar2 = (nle) map2.get(upperCase2);
                if (nleVar2 != null) {
                    str9 = nleVar2.a;
                }
                return CollectionsKt.N(CollectionsKt.U(str5, str13, str9), ApiConstant.SPACE, null, null, null, 62);
            case 5:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.second;
                bool.booleanValue();
                return bool;
            case 6:
                pug pugVar = (pug) obj;
                pugVar.getClass();
                z45.a.getClass();
                mug.h(pugVar, v45.E);
                return Unit.INSTANCE;
            case 7:
                pug pugVar2 = (pug) obj;
                pugVar2.getClass();
                nug.a(pugVar2);
                return Unit.INSTANCE;
            case 8:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ni8 ni8Var = (ni8) obj;
                return "'" + ni8Var.a() + "' " + ni8Var.b();
            case 10:
                Throwable th = (Throwable) obj;
                Set set = lpe.c;
                th.getClass();
                set.getClass();
                if (th instanceof vuh) {
                    z = set.contains(Integer.valueOf(((vuh) th).a.a));
                }
                return Boolean.valueOf(z);
            case 11:
                String str15 = (String) obj;
                str15.getClass();
                return str15;
            case 12:
                JSONObject jSONObject4 = (JSONObject) obj;
                if (jSONObject4 != null) {
                    str2 = jSONObject4.optString("style");
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str6 = str2;
                }
                PolyWebBridge.HapticStyle HapticStyle = PolyWebBridge.INSTANCE.HapticStyle(str6);
                if (HapticStyle != null) {
                    return new PolyBridgeV1.HapticsMessage(HapticStyle);
                }
                dmk.v("Unknown haptic style: ".concat(str6));
                return null;
            case 13:
                JSONObject jSONObject5 = (JSONObject) obj;
                if (jSONObject5 != null) {
                    str3 = jSONObject5.optString("eventName");
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str6 = str3;
                }
                if (jSONObject5 != null) {
                    jSONObject3 = jSONObject5.optJSONObject(RadarTripOptions.KEY_METADATA);
                }
                return new PolyBridgeV1.LogEventMessage(str6, sqn.c(jSONObject3));
            case 14:
                return new PolyBridgeV1.ResetAuthMessage();
            case 15:
                JSONObject jSONObject6 = (JSONObject) obj;
                if (jSONObject6 != null) {
                    jSONObject2 = jSONObject6.optJSONObject(RadarTripOptions.KEY_METADATA);
                }
                return new PolyBridgeV1.CloseMessage(sqn.c(jSONObject2));
            case 16:
                JSONObject jSONObject7 = (JSONObject) obj;
                if (jSONObject7 != null) {
                    jSONObject = jSONObject7.optJSONObject(RadarTripOptions.KEY_METADATA);
                }
                return new PolyBridgeV1.PageReadyMessage(sqn.c(jSONObject));
            case 17:
                ((PolyBridgeV1.PageReadyMessage) obj).getClass();
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                JSONObject jSONObject8 = (JSONObject) obj;
                if (jSONObject8 != null) {
                    str4 = jSONObject8.optString("permission");
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    str6 = str4;
                }
                PolyWebBridge.PermissionKind PermissionKind = PolyWebBridge.INSTANCE.PermissionKind(str6);
                if (PermissionKind != null) {
                    return new PolyBridgeV1.RequestPermissionMessage(PermissionKind);
                }
                dmk.v("Unknown permission kind: ".concat(str6));
                return null;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new PolyBridgeV1.GetDeviceAttestationMessage();
            case 20:
                JSONObject jSONObject9 = (JSONObject) obj;
                if (jSONObject9 != null) {
                    str8 = jSONObject9.optString("url");
                }
                if (str8 != null) {
                    str6 = str8;
                }
                return new PolyBridgeV1.OpenMessage(str6);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((MidtermsRaceRating) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((MidtermsRegion) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((Boolean) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                v0c v0cVar = (v0c) obj;
                v0cVar.getClass();
                return new qa0(v0cVar.a, v0cVar.b, v0cVar.c);
            case 25:
                qa0 qa0Var = (qa0) obj;
                qa0Var.getClass();
                return new v0c(qa0Var.a, qa0Var.b, qa0Var.c);
            case 26:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return pair2.getFirst();
            case 27:
                lda ldaVar = (lda) obj;
                ldaVar.getClass();
                ldaVar.a = true;
                return Unit.INSTANCE;
            case 28:
                return PortfolioSummaryViewModel.Callbacks.a((EUserPosition) obj);
            default:
                return PortfolioSummaryViewModel.Callbacks.d((EUserPosition) obj);
        }
    }

    public /* synthetic */ iie(Object obj, int i) {
        this.a = i;
    }
}
