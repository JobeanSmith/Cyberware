INSERT INTO language (name)
VALUES ('english'),
       ('french');

INSERT INTO category (description)
VALUES ('brain performance improvement'),
       ('sight sense improvement'),
       ('physical endurance improvement'),
       ('immune resistance improvement'),
       ('physical reaction improvement'),
       ('integumentary resistance improvement'),
       ('physical resistance improvement'),
       ('hands performance improvement'),
       ('arms performance improvement'),
       ('legs performance improvement');

INSERT INTO category_translation (category, language, name)
VALUES (1, 1, 'brain'),
       (1, 2, 'cerveaux'),

       (2, 1, 'ocular system'),
       (2, 2, 'système oculaire'),

       (3, 1, 'circulatory system'),
       (3, 2, 'système circulatoire'),

       (4, 1, 'immune system'),
       (4, 2, 'système immunitaire'),

       (5, 1, 'nervous system'),
       (5, 2, 'système nerveux'),

       (6, 1, 'integumentary system'),
       (6, 2, 'système tégumentaire'),

       (7, 1, 'skeleton'),
       (7, 2, 'squelette'),

       (8, 1, 'hands'),
       (8, 2, 'mains'),

       (9, 1, 'arms'),
       (9, 2, 'bras'),
       
       (10, 1, 'legs'),
       (10, 2, 'jambes');

INSERT INTO item (name, price, description, category)
VALUES ('Camillo Ram Manager', 14000, 'Instantly restores 30% of RAM.', 1),
       ('Ex-Disk', 28000, 'Max RAM +5.', 1),
       ('Heal-On-Kill', 35000, 'Defeating an enemy restores 10% health.', 1),
       ('Limbic System Enhancement', 21000, '+25% critical chance.', 1),
       ('Mechatronic Core', 21000, 'Damage dealt to Drones, Androids, and Mechs +50%.', 1),
       ('Memory Boost', 12000, '+3 RAM when you defeat an enemy.', 1),
       ('Ram Upgrade', 3000, '+0,15 sec RAM recovery rate.', 1),
       ('Self-Ice', 9000, 'Prevents enemy netrunners from hacking you.', 1),
       ('Visual Cortex Support', 21000, 'Critical Damage +45%.', 1),

       ('Kiroshi Optics MK.1', 1000, 'Enhances vision for scanning.', 2),
       ('Kiroshi Optics MK.2', 3000, 'Enhances vision for scanning.', 2),
       ('Kiroshi Optics MK.3', 5000, 'Enhances vision for scanning.', 2),
       
       ('Adrenaline Booster', 28000, '+50% stamina when you defeat an enemy.', 3),
       ('Bioconductor', 14000, 'Cyberware cooldowns -30%.', 3),
       ('Biomonitor', 42000, 'Restores 100% health when total drops below 15%. Cooldown 120 seconds.', 3),
       ('Bioplastic Blood Vessels', 14000, 'Health regeneration outside combat +50 per second.', 3),
       ('Blood Pump', 35000, 'Activate to instantly restore 90% health. Cooldown 180 seconds.', 3),
       ('Feedback Circuit', 21000, 'Instantly restores 10% Health after you discharge a fully charged weapon.', 3),
       ('Microgenerator', 7000, 'Release an EMP blast that deals +50% of the target max Health when your own HP drops below 15%.', 3),
       ('Second Heart', 42000, 'Revives you if your health is fully depleted, completely restoring the meter. Cooldown of 2 minutes.', 3),
       ('Syn-Lungs', 7000, 'Increases Stamina regen by 25.', 3),
       ('Tyrosine Injector', 150, 'Increases Breach Protocol timer by 100%.', 3),
       
       ('Cataresist', 14000, 'Increases all resistances by 35%.', 4),
       ('Inductor', 20000, 'Getting shocked or affected by EMP effects boosts your Armor by 50% instead of dealing damage.', 4),
       ('Detoxifier', 12000, 'Grants full immunity against Poison effects.', 4),
       ('Metabolic Editor', 25000, 'Getting poisoned restores 12% health per second instead of dealing damage.', 4),
       ('Pain Editor', 28000, 'Reduces all incoming damage by 10%.', 4),
       ('Shock-N-Awe', 7000, 'When hit, you have a 10% chance to release an electroshock blast dealing damage to nearby enemies equal to 20% of their max health.', 4),

       ('Kerenzikov', 35000, 'Allows you to aim and shoot while dodging. Slows time by 90% for 3,5 sec. When blocking, aiming or attacking during a slide or dodge. Cooldown 5 sec.', 5),
       ('Reflex Tuner', 35000, 'Slow time by 80% for 4 sec. when your health drops to 25%. Cooldown 40 seconds.', 5),
       ('Maneuvering System', 3000, 'Allows you to perform dodges in midair.', 5),
       ('Nanorelays', 20000, 'Increases Sandevistan and Kerenzikov duration by 2 sec.', 5),
       ('Neofiber', 7000, 'Increases evasion by 15%.', 5),
       ('Synaptic Accelerator', 35000, 'Slows time by 50% for 4 sec. when you are detected by enemies. Cooldown 60 sec.', 5),

       ('Fireproof Coating', 12000, 'Grants full immunity against burn.', 6),
       ('Grounding Plating', 12000, 'Grants full immunity against shock.', 6),
       ('Heat Converter', 25000, 'Burn effects increase the damage you deal by 10% instead of harming you.', 6),
       ('Optical Camo', 35000, 'Activate to turn almost invisible for 15 seconds, greatly reducing the likelihood of detection. Cooldown 60 seconds.', 6),
       ('Subdermal Armor', 14000, 'Increases armor by 200.', 6),
       ('Supradermal Weave', 12000, 'Grants full immunity against bleeding.', 6),

       ('Bionic Joints', 10000, 'Recoil kick after shooting with ranged weapons -25%.', 7),
       ('Bionic Lungs', 7000, 'Increases Stamina by 60%.', 7),
       ('Dense Marrow', 10000, 'Melee weapon damage +25%, but stamina drain +10%.', 7),
       ('Synaptic Signal Optimizer', 28000, 'Max health +60%.', 7),
       ('Microrotors', 14000, 'Melee weapon attack speed +25%.', 7),
       ('Microvibration Generator', 25000, 'Melee weapon damage +15%.', 7),
       ('Titanium Bones', 3000, 'Increases carrying capacity by 60%.', 7),

       ('Ballistic Coprocessor', 21000, 'Increases the chance to ricochet shots with Power weapons. Bullets ricochet 2 additional time.', 8),
       ('Smart Link', 21000, 'Enables you to use the auto-targeting system in Smart weapons, greatly increasing their efficiency. Chance for Smart bullets to home in on the target +15%; Critical Damage +25%.', 8),

       ('Gorilla Arms', 55250, 'Turns your fists into deadly weapons. Hitting enemies builds a charge that can be released with a strong attack, causing severe damage. 3 universal mod slots available.', 9),
       ('Mantis Blades', 55350, 'Two deadly blades useful for melee combat and to lunge at enemies. 3 universal mod slots available.', 9),
       ('Monowire', 55450, 'A self-charging wire that can lash multiple enemies simultaneously, with a surprisingly long range for a melee weapon. Attacking discharges the wire, which recharges when equipped but not in use. 3 universal mod slots available.', 9),
       ('Projectile Launch System', 55450, 'A projectile launcher used to fire missiles over long distances. 3 universal mod slots available.', 9),

       ('Fortified Ankles', 75000, 'Hold jump button to charge the power of the jump, then release to jump. Reduces fall damage in 15%. Enables you to perform hover jumps.', 10),
       ('Lynx Paws', 85000, 'You make 50% less noise when moving.', 10),
       ('Reinforced Tendons', 45000, 'Press jump button while in midair to perform a double jump.', 10);