CREATE TABLE notification (
        id serial not null,
        user_id   int references public.registration(user_id),
        email varchar(50) not null,
        notified_date date,
        message      varchar(1000)
);


CREATE TABLE notification (
      id serial not null,
      user_id   int not null,
      email varchar(50) references public.registration(email),
      notified_date date,
      message      varchar(1000)
);
