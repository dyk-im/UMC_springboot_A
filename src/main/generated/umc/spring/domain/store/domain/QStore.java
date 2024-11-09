package umc.spring.domain.store.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = -907001712L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStore store = new QStore("store");

    public final umc.spring.domain.shared.QBaseTimeEntity _super = new umc.spring.domain.shared.QBaseTimeEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<umc.spring.domain.mission.domain.Mission, umc.spring.domain.mission.domain.QMission> missionList = this.<umc.spring.domain.mission.domain.Mission, umc.spring.domain.mission.domain.QMission>createList("missionList", umc.spring.domain.mission.domain.Mission.class, umc.spring.domain.mission.domain.QMission.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final umc.spring.domain.QRegion region;

    public final ListPath<umc.spring.domain.review.domain.Review, umc.spring.domain.review.domain.QReview> reviewList = this.<umc.spring.domain.review.domain.Review, umc.spring.domain.review.domain.QReview>createList("reviewList", umc.spring.domain.review.domain.Review.class, umc.spring.domain.review.domain.QReview.class, PathInits.DIRECT2);

    public final NumberPath<Float> score = createNumber("score", Float.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QStore(String variable) {
        this(Store.class, forVariable(variable), INITS);
    }

    public QStore(Path<? extends Store> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStore(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStore(PathMetadata metadata, PathInits inits) {
        this(Store.class, metadata, inits);
    }

    public QStore(Class<? extends Store> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new umc.spring.domain.QRegion(forProperty("region")) : null;
    }

}

