package defpackage;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class juf extends fq8 implements Function1 {
    public static final juf f = new fq8(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
