package defpackage;

import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface xre extends yl6, mjf, jkf, jk6 {
    default Object A(String str, Reaction reaction, boolean z, User user, w5g w5gVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object B(String str, Reaction reaction, boolean z, boolean z2, User user, sl3 sl3Var) {
        return Unit.INSTANCE;
    }

    default Object C(String str, w5g w5gVar, vk3 vk3Var) {
        return Unit.INSTANCE;
    }

    default Object D(w5g w5gVar, Integer num, Map map, boolean z, boolean z2, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object E(String str, String str2) {
        return new u5g(Unit.INSTANCE);
    }

    default Object G(String str, String str2, Message message, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object I(String str, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object K(String str, String str2, String str3, User user, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object M(String str, String str2, djf djfVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default void N(w5g w5gVar, String str, String str2, String str3, Map map, Date date) {
        w5gVar.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
    }

    default Object P(Message message, ll3 ll3Var) {
        return Unit.INSTANCE;
    }

    default Object Q(String str, String str2, bb5 bb5Var, User user, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object e(String str, String str2, String str3, User user, w5g w5gVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object f(w5g w5gVar, String str, String str2, Message message, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object g(String str, w5g w5gVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default qwh getErrorHandler() {
        return null;
    }

    default Object h(User user, Reaction reaction, Continuation continuation) {
        return new u5g(Unit.INSTANCE);
    }

    default void j(User user) {
        user.getClass();
    }

    default Object k(String str, String str2, djf djfVar, dz dzVar) {
        return new u5g(Unit.INSTANCE);
    }

    default w5g l(User user) {
        return new u5g(Unit.INSTANCE);
    }

    default void n(String str, String str2, String str3, Map map, Date date) {
        str2.getClass();
        str3.getClass();
        date.getClass();
    }

    default Object o(Message message, w5g w5gVar, zei zeiVar) {
        return Unit.INSTANCE;
    }

    default w5g p(String str, String str2, String str3, Map map, Date date) {
        str2.getClass();
        str3.getClass();
        date.getClass();
        return new u5g(Unit.INSTANCE);
    }

    default Object q(String str, String str2, ArrayList arrayList, w5g w5gVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object r(w5g w5gVar, String str, String str2, int i, int i2, FilterObject filterObject, QuerySorter querySorter, List list, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default w5g u(User user, String str, ArrayList arrayList) {
        return new u5g(Unit.INSTANCE);
    }

    default Object v(String str, Continuation continuation) {
        return new u5g(Unit.INSTANCE);
    }

    default Object w(w5g w5gVar, String str, String str2, djf djfVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default void L() {
    }
}
