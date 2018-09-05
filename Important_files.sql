-- Database: helpping_students

-- DROP DATABASE helpping_students;

CREATE DATABASE helpping_students
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
    

    
    -- Table: public."USERS"

-- DROP TABLE public."USERS";

CREATE TABLE public."USERS"
(
    "USER_ID" integer NOT NULL,
    username character(100) COLLATE pg_catalog."default",
    password character(100) COLLATE pg_catalog."default",
    email character(100) COLLATE pg_catalog."default",
    CONSTRAINT "USERS_pkey" PRIMARY KEY ("USER_ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."USERS"
    OWNER to postgres;
    
    
    
    
-- Table: public.about_us

-- DROP TABLE public.about_us;

CREATE TABLE public.about_us
(
    id integer NOT NULL,
    comments character(100) COLLATE pg_catalog."default",
    email character(100) COLLATE pg_catalog."default",
    rating_number integer,
    CONSTRAINT about_us_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.about_us
    OWNER to postgres;
    
    
    -- Table: public.archived_user

-- DROP TABLE public.archived_user;

CREATE TABLE public.archived_user
(
    id integer NOT NULL,
    email character(100) COLLATE pg_catalog."default",
    user_id integer,
    CONSTRAINT "Archived_user_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.archived_user
    OWNER to postgres;
    
    
    -- Table: public.college_braches

-- DROP TABLE public.college_braches;

CREATE TABLE public.college_braches
(
    id integer NOT NULL,
    branch_name character(100) COLLATE pg_catalog."default",
    college_id integer,
    CONSTRAINT "College_braches_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.college_braches
    OWNER to postgres;
    
    
    -- Table: public.lecture

-- DROP TABLE public.lecture;

CREATE TABLE public.lecture
(
    id integer NOT NULL,
    college_id integer,
    name character(1000) COLLATE pg_catalog."default",
    branch character(100) COLLATE pg_catalog."default",
    active_lecture integer,
    CONSTRAINT lecture_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.lecture
    OWNER to postgres;
    
    
    -- Table: public.notification

-- DROP TABLE public.notification;

CREATE TABLE public.notification
(
    id integer NOT NULL DEFAULT nextval('notification_id_seq'::regclass),
    user_id integer NOT NULL,
    email character varying(400) COLLATE pg_catalog."default" NOT NULL,
    notified_date date,
    message character varying(400) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT notification_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.notification
    OWNER to postgres;
    
    
    
    -- Table: public.registration

-- DROP TABLE public.registration;

CREATE TABLE public.registration
(
    user_id integer NOT NULL DEFAULT nextval('registration_user_id_seq'::regclass),
    first_name character(100) COLLATE pg_catalog."default" NOT NULL,
    last_name character(100) COLLATE pg_catalog."default" NOT NULL,
    email character(100) COLLATE pg_catalog."default" NOT NULL,
    password character(100) COLLATE pg_catalog."default" NOT NULL,
    is_archived integer,
    CONSTRAINT registration_pkey PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.registration
    OWNER to postgres;
    
    