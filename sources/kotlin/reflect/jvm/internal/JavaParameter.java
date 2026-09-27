package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JavaParameter;", "", "callable", "Ljava/lang/reflect/Member;", "index", "", "<init>", "(Ljava/lang/reflect/Member;I)V", "getCallable", "()Ljava/lang/reflect/Member;", "getIndex", "()I", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JavaParameter {
    private final Member callable;
    private final int index;

    public JavaParameter(Member member, int i) {
        member.getClass();
        this.callable = member;
        this.index = i;
    }

    public final Member getCallable() {
        return this.callable;
    }

    public final int getIndex() {
        return this.index;
    }
}
