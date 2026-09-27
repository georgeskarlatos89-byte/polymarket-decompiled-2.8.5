package defpackage;

import android.content.res.Resources;
import com.google.mlkit.common.MlKitException;
import com.polymarket.data.ETaxDocument;
import com.polymarket.usviewmodels.TaxDocumentsListViewModel;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao_Impl;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.utils.TextFieldSaver;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import skip.bridge.SystemKt;
import skip.lib.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class cgi implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ cgi(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        xmd xmdVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                zjf zjfVar = (zjf) obj;
                zjfVar.getClass();
                if (zjfVar.g() != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return SyncStateDao_Impl.b((fcg) obj);
            case 2:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 3:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 4:
                Resources resources = (Resources) obj;
                resources.getClass();
                if ((resources.getConfiguration().uiMode & 48) != 32) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return SystemKt.a((Set) obj);
            case 6:
                return Unit.INSTANCE;
            case 7:
                ((w80) obj).getClass();
                return pw5.h(zf7.e(odn.f(BlurConstants.H_BD, 0, null, 6), 2), zf7.f(odn.f(BlurConstants.H_BD, 0, null, 6), 2));
            case 8:
                ((w80) obj).getClass();
                return pw5.h(zf7.e(odn.f(300, 0, null, 6), 2), zf7.f(odn.f(300, 0, null, 6), 2));
            case 9:
                ((Float) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 11:
                return TaxDocumentsListViewModel.Callbacks.a((ETaxDocument) obj);
            case 12:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 13:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 14:
                return TextAttributeCollectorKt.f((String) obj);
            case 15:
                return TextAttributeCollectorKt.b((AttributeData) obj);
            case 16:
                return TextBlockKt.b((zwi) obj);
            case 17:
                return TextBlockKt.n((List) obj);
            case MlKitException.UNSUPPORTED /* 18 */:
                vti vtiVar = (vti) obj;
                String str = vtiVar.g.b;
                long j = vtiVar.f;
                int i2 = nxi.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    jb7 d = iql.d();
                    if (d == null) {
                        if (i3 > 0) {
                            i = Character.offsetByCodePoints(str, i3, -1);
                            if (i == -1) {
                                return null;
                            }
                            return new wk6(((int) (vtiVar.f & 4294967295L)) - i, 0);
                        }
                    } else {
                        int b = d.b(str, i3 - 1);
                        if (b < 0) {
                            if (i3 > 0) {
                                i = Character.offsetByCodePoints(str, i3, -1);
                            }
                        } else {
                            i = b;
                        }
                        if (i == -1) {
                        }
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case zh4.REMOTE_EXCEPTION /* 19 */:
                vti vtiVar2 = (vti) obj;
                String str2 = vtiVar2.g.b;
                long j2 = vtiVar2.f;
                int i4 = nxi.c;
                int b2 = iql.b((int) (j2 & 4294967295L), str2);
                if (b2 == -1) {
                    return null;
                }
                return new wk6(0, b2 - ((int) (vtiVar2.f & 4294967295L)));
            case 20:
                vti vtiVar3 = (vti) obj;
                Integer e = vtiVar3.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j3 = vtiVar3.f;
                int i5 = nxi.c;
                return new wk6(((int) (j3 & 4294967295L)) - intValue, 0);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                vti vtiVar4 = (vti) obj;
                Integer d2 = vtiVar4.d();
                if (d2 == null) {
                    return null;
                }
                int intValue2 = d2.intValue();
                long j4 = vtiVar4.f;
                int i6 = nxi.c;
                return new wk6(0, intValue2 - ((int) (j4 & 4294967295L)));
            case 22:
                vti vtiVar5 = (vti) obj;
                Integer c = vtiVar5.c();
                if (c == null) {
                    return null;
                }
                int intValue3 = c.intValue();
                long j5 = vtiVar5.f;
                int i7 = nxi.c;
                return new wk6(((int) (j5 & 4294967295L)) - intValue3, 0);
            case 23:
                vti vtiVar6 = (vti) obj;
                Integer b3 = vtiVar6.b();
                if (b3 == null) {
                    return null;
                }
                int intValue4 = b3.intValue();
                long j6 = vtiVar6.f;
                int i8 = nxi.c;
                return new wk6(0, intValue4 - ((int) (j6 & 4294967295L)));
            case 24:
                return TextFieldSaver.a((List) obj);
            case 25:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                if (((Boolean) obj2).booleanValue()) {
                    xmdVar = xmd.Vertical;
                } else {
                    xmdVar = xmd.Horizontal;
                }
                Object obj3 = list.get(0);
                obj3.getClass();
                return new bui(xmdVar, ((Float) obj3).floatValue());
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                ((pug) obj).getClass();
                return Unit.INSTANCE;
            default:
                bg8 bg8Var = (bg8) obj;
                bg8Var.getClass();
                bg8Var.b(false);
                return Unit.INSTANCE;
        }
    }
}
