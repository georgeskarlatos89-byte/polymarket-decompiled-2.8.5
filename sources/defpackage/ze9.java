package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ze9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ze9(Function1 function1, Function1 function12, int i) {
        this.a = i;
        this.b = function1;
        this.c = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        Function1 function12 = this.b;
        switch (i) {
            case 0:
                obj.getClass();
                if (function12 != null) {
                    function12.invoke(obj);
                }
                function1.invoke(obj);
                return Unit.INSTANCE;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                function12.invoke(function1.invoke(jSONObject.optJSONObject(ApiConstant.KEY_DATA)));
                return Unit.INSTANCE;
            case 2:
                function12.invoke(obj);
                function1.invoke(obj);
                return Unit.INSTANCE;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
